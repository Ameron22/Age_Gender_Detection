package com.example.opencv;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import java.io.IOException;

public class Image_Gallery extends AppCompatActivity{
    // One Preview Image
    ImageView IVPreviewImage;
    // constant to compare
    // the activity result code
    //int SELECT_PICTURE = 200;
    private Mat mRgba;
    private faceRecognition faceRecognition;
    //public static int RC_PHOTO_PICKER = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Button btnPredict = findViewById(R.id.BPredict);

        btnPredict.setOnClickListener(v -> {

            Mat mRgba = new Mat(IVPreviewImage.getHeight(),IVPreviewImage.getWidth(), CvType.CV_8UC4 );
            Bitmap bitmap = ((BitmapDrawable) IVPreviewImage.getDrawable()).getBitmap();
            Utils.bitmapToMat(bitmap, mRgba);

            //Pass input as mRgba
            mRgba= faceRecognition.recognizeImage(mRgba);

            Bitmap bitmapImage = Bitmap.createBitmap(mRgba.cols(), mRgba.rows(), Bitmap.Config.ARGB_8888);
            Utils.matToBitmap(mRgba, bitmapImage);

            IVPreviewImage.setImageBitmap(bitmapImage);

            mRgba.release();

        });
        try{
            int inputSize= 48;
            faceRecognition= new faceRecognition(getAssets(), Image_Gallery.this, "resnet_50.tflite","resnet_50_age_2.tflite", inputSize);
        }
        catch (IOException e){
            e.printStackTrace();
            //If error occures
            Log.d("Image_Gallery", "Model is not loaded");
        }

        IVPreviewImage = findViewById(R.id.IVPreviewImage);
        openSomeActivityForResult();
    }

    public void openSomeActivityForResult() {
        ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        assert data != null;
                        Uri uri = data.getData();
                        IVPreviewImage.setImageURI(uri);
                    }
                });

        //Create Intent
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/jpg");
        intent.putExtra(Intent.EXTRA_LOCAL_ONLY, true);
        //Launch activity to get result
        someActivityResultLauncher.launch(intent);
    }


}
