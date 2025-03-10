//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

// C++: class KAZE
/**
 * Class implementing the KAZE keypoint detector and descriptor extractor, described in CITE: ABD12 .
 *
 * <b>Note:</b> AKAZE descriptor can only be used with KAZE or AKAZE keypoints .. [ABD12] KAZE Features. Pablo
 * F. Alcantarilla, Adrien Bartoli and Andrew J. Davison. In European Conference on Computer Vision
 * (ECCV), Fiorenze, Italy, October 2012.
 */
public class KAZE extends Feature2D {

    // C++: enum DiffusivityType (cv.KAZE.DiffusivityType)
    public static final int
            DIFF_PM_G1 = 0,
            DIFF_PM_G2 = 1,
            DIFF_WEICKERT = 2,
            DIFF_CHARBONNIER = 3;

    protected KAZE(long addr) { super(addr); }

    // internal usage only
    public static KAZE __fromPtr__(long addr) { return new KAZE(addr); }


    //
    // C++: static Ptr_KAZE cv::KAZE::create(bool extended = false, bool upright = false, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, KAZE_DiffusivityType diffusivity = KAZE::DIFF_PM_G2)
    //

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     @param upright Set to enable use of upright descriptors (non rotation-invariant).
     *     @param threshold Detector response threshold to accept point
     *     @param nOctaves Maximum octave evolution of the image
     *     @param nOctaveLayers Default number of sublevels per scale level
     *     @param diffusivity Diffusivity type. DIFF_PM_G1, DIFF_PM_G2, DIFF_WEICKERT or
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers, int diffusivity) {
        return KAZE.__fromPtr__(create_0(extended, upright, threshold, nOctaves, nOctaveLayers, diffusivity));
    }

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     @param upright Set to enable use of upright descriptors (non rotation-invariant).
     *     @param threshold Detector response threshold to accept point
     *     @param nOctaves Maximum octave evolution of the image
     *     @param nOctaveLayers Default number of sublevels per scale level
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers) {
        return KAZE.__fromPtr__(create_1(extended, upright, threshold, nOctaves, nOctaveLayers));
    }

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     @param upright Set to enable use of upright descriptors (non rotation-invariant).
     *     @param threshold Detector response threshold to accept point
     *     @param nOctaves Maximum octave evolution of the image
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended, boolean upright, float threshold, int nOctaves) {
        return KAZE.__fromPtr__(create_2(extended, upright, threshold, nOctaves));
    }

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     @param upright Set to enable use of upright descriptors (non rotation-invariant).
     *     @param threshold Detector response threshold to accept point
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended, boolean upright, float threshold) {
        return KAZE.__fromPtr__(create_3(extended, upright, threshold));
    }

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     @param upright Set to enable use of upright descriptors (non rotation-invariant).
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended, boolean upright) {
        return KAZE.__fromPtr__(create_4(extended, upright));
    }

    /**
     * The KAZE constructor
     *
     *     @param extended Set to enable extraction of extended (128-byte) descriptor.
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create(boolean extended) {
        return KAZE.__fromPtr__(create_5(extended));
    }

    /**
     * The KAZE constructor
     *
     *     DIFF_CHARBONNIER
     * @return automatically generated
     */
    public static KAZE create() {
        return KAZE.__fromPtr__(create_6());
    }


    //
    // C++:  void cv::KAZE::setExtended(bool extended)
    //

    // C++: static Ptr_KAZE cv::KAZE::create(bool extended = false, bool upright = false, float threshold = 0.001f, int nOctaves = 4, int nOctaveLayers = 4, KAZE_DiffusivityType diffusivity = KAZE::DIFF_PM_G2)
    private static native long create_0(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers, int diffusivity);


    //
    // C++:  bool cv::KAZE::getExtended()
    //

    private static native long create_1(boolean extended, boolean upright, float threshold, int nOctaves, int nOctaveLayers);


    //
    // C++:  void cv::KAZE::setUpright(bool upright)
    //

    private static native long create_2(boolean extended, boolean upright, float threshold, int nOctaves);


    //
    // C++:  bool cv::KAZE::getUpright()
    //

    private static native long create_3(boolean extended, boolean upright, float threshold);


    //
    // C++:  void cv::KAZE::setThreshold(double threshold)
    //

    private static native long create_4(boolean extended, boolean upright);


    //
    // C++:  double cv::KAZE::getThreshold()
    //

    private static native long create_5(boolean extended);


    //
    // C++:  void cv::KAZE::setNOctaves(int octaves)
    //

    private static native long create_6();


    //
    // C++:  int cv::KAZE::getNOctaves()
    //

    // C++:  void cv::KAZE::setExtended(bool extended)
    private static native void setExtended_0(long nativeObj, boolean extended);


    //
    // C++:  void cv::KAZE::setNOctaveLayers(int octaveLayers)
    //

    // C++:  bool cv::KAZE::getExtended()
    private static native boolean getExtended_0(long nativeObj);


    //
    // C++:  int cv::KAZE::getNOctaveLayers()
    //

    // C++:  void cv::KAZE::setUpright(bool upright)
    private static native void setUpright_0(long nativeObj, boolean upright);


    //
    // C++:  void cv::KAZE::setDiffusivity(KAZE_DiffusivityType diff)
    //

    // C++:  bool cv::KAZE::getUpright()
    private static native boolean getUpright_0(long nativeObj);


    //
    // C++:  KAZE_DiffusivityType cv::KAZE::getDiffusivity()
    //

    // C++:  void cv::KAZE::setThreshold(double threshold)
    private static native void setThreshold_0(long nativeObj, double threshold);


    //
    // C++:  String cv::KAZE::getDefaultName()
    //

    // C++:  double cv::KAZE::getThreshold()
    private static native double getThreshold_0(long nativeObj);

    // C++:  void cv::KAZE::setNOctaves(int octaves)
    private static native void setNOctaves_0(long nativeObj, int octaves);

    // C++:  int cv::KAZE::getNOctaves()
    private static native int getNOctaves_0(long nativeObj);

    // C++:  void cv::KAZE::setNOctaveLayers(int octaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int octaveLayers);

    // C++:  int cv::KAZE::getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);

    // C++:  void cv::KAZE::setDiffusivity(KAZE_DiffusivityType diff)
    private static native void setDiffusivity_0(long nativeObj, int diff);

    // C++:  KAZE_DiffusivityType cv::KAZE::getDiffusivity()
    private static native int getDiffusivity_0(long nativeObj);

    // C++:  String cv::KAZE::getDefaultName()
    private static native String getDefaultName_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public boolean getExtended() {
        return getExtended_0(nativeObj);
    }

    public void setExtended(boolean extended) {
        setExtended_0(nativeObj, extended);
    }

    public boolean getUpright() {
        return getUpright_0(nativeObj);
    }

    public void setUpright(boolean upright) {
        setUpright_0(nativeObj, upright);
    }

    public double getThreshold() {
        return getThreshold_0(nativeObj);
    }

    public void setThreshold(double threshold) {
        setThreshold_0(nativeObj, threshold);
    }

    public int getNOctaves() {
        return getNOctaves_0(nativeObj);
    }

    public void setNOctaves(int octaves) {
        setNOctaves_0(nativeObj, octaves);
    }

    public int getNOctaveLayers() {
        return getNOctaveLayers_0(nativeObj);
    }

    public void setNOctaveLayers(int octaveLayers) {
        setNOctaveLayers_0(nativeObj, octaveLayers);
    }

    public int getDiffusivity() {
        return getDiffusivity_0(nativeObj);
    }

    public void setDiffusivity(int diff) {
        setDiffusivity_0(nativeObj, diff);
    }

    public String getDefaultName() {
        return getDefaultName_0(nativeObj);
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
