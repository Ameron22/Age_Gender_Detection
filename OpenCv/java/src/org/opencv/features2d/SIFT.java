//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class SIFT
/**
 * Class for extracting keypoints and computing descriptors using the Scale Invariant Feature Transform
 * (SIFT) algorithm by D. Lowe CITE: Lowe04 .
 */
public class SIFT extends Feature2D {

    protected SIFT(long addr) { super(addr); }

    // internal usage only
    public static SIFT __fromPtr__(long addr) { return new SIFT(addr); }

    //
    // C++: static Ptr_SIFT cv::SIFT::create(int nfeatures = 0, int nOctaveLayers = 3, double contrastThreshold = 0.04, double edgeThreshold = 10, double sigma = 1.6)
    //

    /**
     * @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
     *     number of octaves is computed automatically from the image resolution.
     *
     *     @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     @param edgeThreshold The threshold used to filter out edge-like features. Note that the its meaning
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     @param sigma The sigma of the Gaussian applied to the input image at the octave \#0. If your image
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma) {
        return SIFT.__fromPtr__(create_0(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma));
    }

    /**
     * @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
     *     number of octaves is computed automatically from the image resolution.
     *
     *     @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     @param edgeThreshold The threshold used to filter out edge-like features. Note that the its meaning
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold) {
        return SIFT.__fromPtr__(create_1(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold));
    }

    /**
     * @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
     *     number of octaves is computed automatically from the image resolution.
     *
     *     @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold) {
        return SIFT.__fromPtr__(create_2(nfeatures, nOctaveLayers, contrastThreshold));
    }

    /**
     * @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
     *     number of octaves is computed automatically from the image resolution.
     *
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures, int nOctaveLayers) {
        return SIFT.__fromPtr__(create_3(nfeatures, nOctaveLayers));
    }

    /**
     * @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     number of octaves is computed automatically from the image resolution.
     *
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures) {
        return SIFT.__fromPtr__(create_4(nfeatures));
    }

    /**
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     number of octaves is computed automatically from the image resolution.
     *
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     * @return automatically generated
     */
    public static SIFT create() {
        return SIFT.__fromPtr__(create_5());
    }


    //
    // C++: static Ptr_SIFT cv::SIFT::create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType)
    //

    /**
     * Create SIFT with specified descriptorType.
     *     @param nfeatures The number of best features to retain. The features are ranked by their scores
     *     (measured in SIFT algorithm as the local contrast)
     *
     *     @param nOctaveLayers The number of layers in each octave. 3 is the value used in D. Lowe paper. The
     *     number of octaves is computed automatically from the image resolution.
     *
     *     @param contrastThreshold The contrast threshold used to filter out weak features in semi-uniform
     *     (low-contrast) regions. The larger the threshold, the less features are produced by the detector.
     *
     *     <b>Note:</b> The contrast threshold will be divided by nOctaveLayers when the filtering is applied. When
     *     nOctaveLayers is set to default and if you want to use the value used in D. Lowe paper, 0.03, set
     *     this argument to 0.09.
     *
     *     @param edgeThreshold The threshold used to filter out edge-like features. Note that the its meaning
     *     is different from the contrastThreshold, i.e. the larger the edgeThreshold, the less features are
     *     filtered out (more features are retained).
     *
     *     @param sigma The sigma of the Gaussian applied to the input image at the octave \#0. If your image
     *     is captured with a weak camera with soft lenses, you might want to reduce the number.
     *
     *     @param descriptorType The type of descriptors. Only CV_32F and CV_8U are supported.
     * @return automatically generated
     */
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType) {
        return SIFT.__fromPtr__(create_6(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma, descriptorType));
    }


    //
    // C++:  String cv::SIFT::getDefaultName()
    //

    // C++: static Ptr_SIFT cv::SIFT::create(int nfeatures = 0, int nOctaveLayers = 3, double contrastThreshold = 0.04, double edgeThreshold = 10, double sigma = 1.6)
    private static native long create_0(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma);


    //
    // C++:  void cv::SIFT::setNFeatures(int maxFeatures)
    //

    private static native long create_1(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold);


    //
    // C++:  int cv::SIFT::getNFeatures()
    //

    private static native long create_2(int nfeatures, int nOctaveLayers, double contrastThreshold);


    //
    // C++:  void cv::SIFT::setNOctaveLayers(int nOctaveLayers)
    //

    private static native long create_3(int nfeatures, int nOctaveLayers);


    //
    // C++:  int cv::SIFT::getNOctaveLayers()
    //

    private static native long create_4(int nfeatures);


    //
    // C++:  void cv::SIFT::setContrastThreshold(double contrastThreshold)
    //

    private static native long create_5();


    //
    // C++:  double cv::SIFT::getContrastThreshold()
    //

    // C++: static Ptr_SIFT cv::SIFT::create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType)
    private static native long create_6(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma, int descriptorType);


    //
    // C++:  void cv::SIFT::setEdgeThreshold(double edgeThreshold)
    //

    // C++:  String cv::SIFT::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);


    //
    // C++:  double cv::SIFT::getEdgeThreshold()
    //

    // C++:  void cv::SIFT::setNFeatures(int maxFeatures)
    private static native void setNFeatures_0(long nativeObj, int maxFeatures);


    //
    // C++:  void cv::SIFT::setSigma(double sigma)
    //

    // C++:  int cv::SIFT::getNFeatures()
    private static native int getNFeatures_0(long nativeObj);


    //
    // C++:  double cv::SIFT::getSigma()
    //

    // C++:  void cv::SIFT::setNOctaveLayers(int nOctaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int nOctaveLayers);

    // C++:  int cv::SIFT::getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);

    // C++:  void cv::SIFT::setContrastThreshold(double contrastThreshold)
    private static native void setContrastThreshold_0(long nativeObj, double contrastThreshold);

    // C++:  double cv::SIFT::getContrastThreshold()
    private static native double getContrastThreshold_0(long nativeObj);

    // C++:  void cv::SIFT::setEdgeThreshold(double edgeThreshold)
    private static native void setEdgeThreshold_0(long nativeObj, double edgeThreshold);

    // C++:  double cv::SIFT::getEdgeThreshold()
    private static native double getEdgeThreshold_0(long nativeObj);

    // C++:  void cv::SIFT::setSigma(double sigma)
    private static native void setSigma_0(long nativeObj, double sigma);

    // C++:  double cv::SIFT::getSigma()
    private static native double getSigma_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }

    public int getNFeatures() {
        return getNFeatures_0(nativeObj);
    }

    public void setNFeatures(int maxFeatures) {
        setNFeatures_0(nativeObj, maxFeatures);
    }

    public int getNOctaveLayers() {
        return getNOctaveLayers_0(nativeObj);
    }

    public void setNOctaveLayers(int nOctaveLayers) {
        setNOctaveLayers_0(nativeObj, nOctaveLayers);
    }

    public double getContrastThreshold() {
        return getContrastThreshold_0(nativeObj);
    }

    public void setContrastThreshold(double contrastThreshold) {
        setContrastThreshold_0(nativeObj, contrastThreshold);
    }

    public double getEdgeThreshold() {
        return getEdgeThreshold_0(nativeObj);
    }

    public void setEdgeThreshold(double edgeThreshold) {
        setEdgeThreshold_0(nativeObj, edgeThreshold);
    }

    public double getSigma() {
        return getSigma_0(nativeObj);
    }

    public void setSigma(double sigma) {
        setSigma_0(nativeObj, sigma);
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
