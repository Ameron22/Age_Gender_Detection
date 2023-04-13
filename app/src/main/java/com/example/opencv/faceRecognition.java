package com.example.opencv;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.util.Log;

import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.gpu.GpuDelegate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;


public class faceRecognition {
    //Implementation of tensorFlow
    //private Interpreter interpreter;
    //define input size of model
    final private int INPUT_SIZE;
    private final Interpreter sex_interpreter;
    private final Interpreter age_interpreter;
    private final Context contextThis;
    //Define CascadeClassifier
    private CascadeClassifier cascadeClassifier;
    faceRecognition(AssetManager assetManager, Context context, String sex_modelPath, String age_modelPath, int input_size) throws IOException{
        contextThis = context;
        INPUT_SIZE = input_size;
        boolean useGpuDelegate = false;
        final  Interpreter.Options options = new Interpreter.Options();
        options.setNumThreads(2); //If the phone can't manage it, reduce the number of threads
        if (useGpuDelegate){
            //define Gputdelegate;
            GpuDelegate gpuDelegate = new GpuDelegate();
            options.addDelegate(gpuDelegate);
        }
        //load model
        sex_interpreter = new Interpreter(loadModel(assetManager, sex_modelPath), options);
        age_interpreter = new Interpreter(loadModel(assetManager, age_modelPath), options);

        Log.d("Gender and age recognition", "Model is loaded");
        //load the haar cascade model
        try{
            //define input stream to read haar cascade file
            InputStream inputStream= context.getResources().openRawResource(R.raw.haarcascade_frontalface_default);
            //create folder used to save classifier
            File cascadeDir= context.getDir("cascade", Context.MODE_PRIVATE);
            //create a new cascade file in that folder
            File mCascadeFile= new File(cascadeDir, "haarcascade_frontalface_default");
            //define output stream to save haarcascade_frontalface_default in mCascadeFile
            FileOutputStream outputStream= new FileOutputStream(mCascadeFile);
            //create empty byte buffer to store byte
            byte[] buffer = new byte[4096];
            int byteRead;
            //read byte in loop
            //when it read -1 means no data to read
            while ((byteRead=inputStream.read(buffer)) != -1 ){
                outputStream.write(buffer, 0, byteRead);
            }
            //when reading file complete
            inputStream.close();
            outputStream.close();
            //load cascade classifier
            cascadeClassifier = new CascadeClassifier(mCascadeFile.getAbsolutePath());
            //if cascade classifier is successfully loaded
            Log.d("face recognition", "Classifier loaded");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Mat recognizeImage(Mat mat_image){
        //function called in OnFrame in CameraActivity
        //Rotate the image by 90 degree
        if(contextThis.getClass() == CameraActivity.class){
            Core.flip(mat_image.t(), mat_image, 0);
        }

        //Preprocess:
        //convert to grayscale
        Mat grayscaleImage = new Mat();
        Imgproc.cvtColor(mat_image, grayscaleImage, Imgproc.COLOR_RGBA2GRAY);
        //DEFINE height and width
        //define height and width of frame
        int height = grayscaleImage.height();
        int width = grayscaleImage.width();
        //define minimum height and width of face in frame
        int absoluteFaceSize=(int) (height *0.1);
        //To store faces
        MatOfRect faces= new MatOfRect();
        //check if haarcascade is loaded
        if(cascadeClassifier != null){
            //detect face in frame
                        //                      input           output          scale of face
            cascadeClassifier.detectMultiScale(grayscaleImage, faces, 1.1, 2, 2,
                    new Size(absoluteFaceSize,absoluteFaceSize), new Size());
                    // minimum size of face
        }
        //convert face to array
        Rect[] faceArray= faces.toArray();
        //loop through each face
        for (Rect rect : faceArray) {
            //draw rectangle around the faces
            //                    inputoutput               end point          Color      R G  B    alpha
            Imgproc.rectangle(mat_image, rect.tl(), rect.br(), new Scalar(0, 255, 0, 255), 2);
            //                             starting point
            //                  starting x coordinate   starting y coordinate
            Rect roi = new Rect((int) rect.tl().x, (int) rect.tl().y,
                    ((int) rect.br().x) - ((int) rect.tl().x),
                    ((int) rect.br().y) - ((int) rect.tl().y));
            //roi is used to crop faces from image
            Mat cropped_rgb = new Mat(mat_image, roi);
            //convert cropped_rgb to bitmap
            Bitmap bitmap;
            bitmap = Bitmap.createBitmap(cropped_rgb.cols(), cropped_rgb.rows(), Bitmap.Config.ARGB_8888);
            Utils.matToBitmap(cropped_rgb, bitmap);
            //scale bitmap to model input size 48
            Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, INPUT_SIZE, INPUT_SIZE, false);
            //convert scaledBitmap to byteBuffer
            ByteBuffer byteBuffer = convertBitmaptoByteBuffer(scaledBitmap);


            float[][] sex = new float[1][1];
            float[][] age = new float[1][7]; // Modify the shape as needed
            //float[][][] outputs = {sex, age};
            //float[][][] outputs = new float[1][2][8];
            // create output buffers and associate them with output arrays

            sex_interpreter.run(byteBuffer, sex);
            age_interpreter.run(byteBuffer, age);


            String face_age_gender = detect_age_gender(sex[0][0], age[0]);
            //put text on frame

            Imgproc.putText(mat_image, "" + face_age_gender,
                    new Point((int) rect.tl().x + 10, (int) rect.tl().y + 20),
                    1, 1.5, new Scalar(25, 150, 23, 150), 2);

            if (contextThis.getClass() == CameraActivity.class) {
                Core.flip(mat_image.t(), mat_image, 1);
            }
        }
        return mat_image;
    }

    private String detect_age_gender(float sex_val, float[] age_vals) {
        String val= " " + sex_val;
        if(sex_val < 0.5){
            val += "Male ";
        }else {
            val += "Female ";
        }


        int maxIndx = 0; // initialize max with the first element of the array

        for (int i = 1; i < age_vals.length; i++) {
            if (age_vals[i] > age_vals[maxIndx]) {
                maxIndx = i;
            }
        }

        if (maxIndx == 0) {
            val += "0-2";
        } else if (maxIndx == 1) {
            val += "3-6";
        } else if (maxIndx == 2) {
            val += "7-11";
        } else if (maxIndx == 3) {
            val += "12-17";
        } else if (maxIndx == 4) {
            val += "18-29";
        } else if (maxIndx == 5) {
            val += "30-49";
        } else if (maxIndx == 6) {
            val += "50-74";
        } else {
            val += "75+";
        }

        val += " years " + age_vals[maxIndx]*100 +"%";

        return val;
    }


    private ByteBuffer convertBitmaptoByteBuffer(Bitmap scaledBitmap) {
        ByteBuffer byteBuffer;
        int inputSize = INPUT_SIZE;
        //Multiply by 4 if input is float or by 3 if input is RGB
        byteBuffer=ByteBuffer.allocateDirect(4 * inputSize * inputSize * 3);
        byteBuffer.order(ByteOrder.nativeOrder());
        int[] intValues= new int[inputSize*inputSize];
        scaledBitmap.getPixels(intValues, 0, scaledBitmap.getWidth(), 0,0,
                scaledBitmap.getWidth(), scaledBitmap.getHeight());
        int pixels=0;
        //loop through each pixel
        for(int i=0; i < inputSize; i++){
            for(int j=0; j<inputSize; j++){
                final int val = intValues[pixels++];
                //put pixel value in byteBuffer
                byteBuffer.putFloat((((val>>16)&0xFF))/255.0f);
                byteBuffer.putFloat((((val>>8)&0xFF))/255.0f);
                byteBuffer.putFloat(((val & 0xFF))/255.0f);
                //scaling pixels from 0-255 to 0-1
            }
        }
        return byteBuffer;
    }


    //load model function
    private MappedByteBuffer loadModel(AssetManager assetManager, String modelPath) throws IOException {
        //Used for description of the modelPath
        AssetFileDescriptor assetFileDescriptor= assetManager.openFd(modelPath);
        //Create a inputstream to read model path
        FileInputStream inputStream= new FileInputStream(assetFileDescriptor.getFileDescriptor());
        FileChannel fileChannel= inputStream.getChannel();
        long startOffset= assetFileDescriptor.getStartOffset();
        long declaredLength = assetFileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);

    }


}
