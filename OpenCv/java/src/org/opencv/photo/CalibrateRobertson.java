//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.core.Mat;

// C++: class CalibrateRobertson
/**
 * Inverse camera response function is extracted for each brightness value by minimizing an objective
 * function as linear system. This algorithm uses all image pixels.
 *
 * For more information see CITE: RB99 .
 */
public class CalibrateRobertson extends CalibrateCRF {

    protected CalibrateRobertson(long addr) { super(addr); }

    // internal usage only
    public static CalibrateRobertson __fromPtr__(long addr) { return new CalibrateRobertson(addr); }

    //
    // C++:  int cv::CalibrateRobertson::getMaxIter()
    //

    // C++:  int cv::CalibrateRobertson::getMaxIter()
    private static native int getMaxIter_0(long nativeObj);


    //
    // C++:  void cv::CalibrateRobertson::setMaxIter(int max_iter)
    //

    // C++:  void cv::CalibrateRobertson::setMaxIter(int max_iter)
    private static native void setMaxIter_0(long nativeObj, int max_iter);


    //
    // C++:  float cv::CalibrateRobertson::getThreshold()
    //

    // C++:  float cv::CalibrateRobertson::getThreshold()
    private static native float getThreshold_0(long nativeObj);


    //
    // C++:  void cv::CalibrateRobertson::setThreshold(float threshold)
    //

    // C++:  void cv::CalibrateRobertson::setThreshold(float threshold)
    private static native void setThreshold_0(long nativeObj, float threshold);


    //
    // C++:  Mat cv::CalibrateRobertson::getRadiance()
    //

    // C++:  Mat cv::CalibrateRobertson::getRadiance()
    private static native long getRadiance_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public int getMaxIter() {
        return getMaxIter_0(nativeObj);
    }

    public void setMaxIter(int max_iter) {
        setMaxIter_0(nativeObj, max_iter);
    }

    public float getThreshold() {
        return getThreshold_0(nativeObj);
    }

    public void setThreshold(float threshold) {
        setThreshold_0(nativeObj, threshold);
    }

    public Mat getRadiance() {
        return new Mat(getRadiance_0(nativeObj));
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
