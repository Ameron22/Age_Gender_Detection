//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.Point3;
import org.opencv.core.Size;
import org.opencv.utils.Converters;

import java.util.ArrayList;
import java.util.List;

// C++: class Board
/**
 * Board of ArUco markers
 *
 * A board is a set of markers in the 3D space with a common coordinate system.
 * The common form of a board of marker is a planar (2D) board, however any 3D layout can be used.
 * A Board object is composed by:
 * - The object points of the marker corners, i.e. their coordinates respect to the board system.
 * - The dictionary which indicates the type of markers of the board
 * - The identifier of all the markers in the board.
 */
public class Board {

    protected final long nativeObj;
    protected Board(long addr) { nativeObj = addr; }

    /**
     * Common Board constructor
     *
     * @param objPoints array of object points of all the marker corners in the board
     * @param dictionary the dictionary of markers employed for this board
     * @param ids vector of the identifiers of the markers in the board
     */
    public Board(List<Mat> objPoints, Dictionary dictionary, Mat ids) {
        Mat objPoints_mat = Converters.vector_Mat_to_Mat(objPoints);
        nativeObj = Board_0(objPoints_mat.nativeObj, dictionary.nativeObj, ids.nativeObj);
    }

    // internal usage only
    public static Board __fromPtr__(long addr) { return new Board(addr); }

    //
    // C++:   cv::aruco::Board::Board(vector_Mat objPoints, Dictionary dictionary, Mat ids)
    //

    // C++:   cv::aruco::Board::Board(vector_Mat objPoints, Dictionary dictionary, Mat ids)
    private static native long Board_0(long objPoints_mat_nativeObj, long dictionary_nativeObj, long ids_nativeObj);


    //
    // C++:  Dictionary cv::aruco::Board::getDictionary()
    //

    // C++:  Dictionary cv::aruco::Board::getDictionary()
    private static native long getDictionary_0(long nativeObj);


    //
    // C++:  vector_vector_Point3f cv::aruco::Board::getObjPoints()
    //

    // C++:  vector_vector_Point3f cv::aruco::Board::getObjPoints()
    private static native long getObjPoints_0(long nativeObj);


    //
    // C++:  vector_int cv::aruco::Board::getIds()
    //

    // C++:  vector_int cv::aruco::Board::getIds()
    private static native long getIds_0(long nativeObj);


    //
    // C++:  Point3f cv::aruco::Board::getRightBottomCorner()
    //

    // C++:  Point3f cv::aruco::Board::getRightBottomCorner()
    private static native double[] getRightBottomCorner_0(long nativeObj);


    //
    // C++:  void cv::aruco::Board::matchImagePoints(vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    //

    // C++:  void cv::aruco::Board::matchImagePoints(vector_Mat detectedCorners, Mat detectedIds, Mat& objPoints, Mat& imgPoints)
    private static native void matchImagePoints_0(long nativeObj, long detectedCorners_mat_nativeObj, long detectedIds_nativeObj, long objPoints_nativeObj, long imgPoints_nativeObj);


    //
    // C++:  void cv::aruco::Board::generateImage(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    //

    // C++:  void cv::aruco::Board::generateImage(Size outSize, Mat& img, int marginSize = 0, int borderBits = 1)
    private static native void generateImage_0(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize, int borderBits);

    private static native void generateImage_1(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj, int marginSize);

    private static native void generateImage_2(long nativeObj, double outSize_width, double outSize_height, long img_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public long getNativeObjAddr() { return nativeObj; }

    /**
     * return the Dictionary of markers employed for this board
     * @return automatically generated
     */
    public Dictionary getDictionary() {
        return new Dictionary(getDictionary_0(nativeObj));
    }

    /**
     * return array of object points of all the marker corners in the board.
     *
     * Each marker include its 4 corners in this order:
     * -   objPoints[i][0] - left-top point of i-th marker
     * -   objPoints[i][1] - right-top point of i-th marker
     * -   objPoints[i][2] - right-bottom point of i-th marker
     * -   objPoints[i][3] - left-bottom point of i-th marker
     *
     * Markers are placed in a certain order - row by row, left to right in every row. For M markers, the size is Mx4.
     * @return automatically generated
     */
    public List<MatOfPoint3f> getObjPoints() {
        List<MatOfPoint3f> retVal = new ArrayList<MatOfPoint3f>();
        Mat retValMat = new Mat(getObjPoints_0(nativeObj));
        Converters.Mat_to_vector_vector_Point3f(retValMat, retVal);
        return retVal;
    }

    /**
     * vector of the identifiers of the markers in the board (should be the same size as objPoints)
     * @return vector of the identifiers of the markers
     */
    public MatOfInt getIds() {
        return MatOfInt.fromNativeAddr(getIds_0(nativeObj));
    }

    /**
     * get coordinate of the bottom right corner of the board, is set when calling the function create()
     * @return automatically generated
     */
    public Point3 getRightBottomCorner() {
        return new Point3(getRightBottomCorner_0(nativeObj));
    }

    /**
     * Given a board configuration and a set of detected markers, returns the corresponding
     * image points and object points to call solvePnP()
     *
     * @param detectedCorners List of detected marker corners of the board.
     * For CharucoBoard class you can set list of charuco corners.
     * @param detectedIds List of identifiers for each marker or list of charuco identifiers for each corner.
     * For CharucoBoard class you can set list of charuco identifiers for each corner.
     * @param objPoints Vector of vectors of board marker points in the board coordinate space.
     * @param imgPoints Vector of vectors of the projections of board marker corner points.
     */
    public void matchImagePoints(List<Mat> detectedCorners, Mat detectedIds, Mat objPoints, Mat imgPoints) {
        Mat detectedCorners_mat = Converters.vector_Mat_to_Mat(detectedCorners);
        matchImagePoints_0(nativeObj, detectedCorners_mat.nativeObj, detectedIds.nativeObj, objPoints.nativeObj, imgPoints.nativeObj);
    }

    /**
     * Draw a planar board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of the board, ready to be printed.
     */
    public void generateImage(Size outSize, Mat img, int marginSize, int borderBits) {
        generateImage_0(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize, borderBits);
    }

    /**
     * Draw a planar board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     *
     * This function return the image of the board, ready to be printed.
     */
    public void generateImage(Size outSize, Mat img, int marginSize) {
        generateImage_1(nativeObj, outSize.width, outSize.height, img.nativeObj, marginSize);
    }

    /**
     * Draw a planar board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     *
     * This function return the image of the board, ready to be printed.
     */
    public void generateImage(Size outSize, Mat img) {
        generateImage_2(nativeObj, outSize.width, outSize.height, img.nativeObj);
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
