//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

// C++: class TonemapReinhard
/**
 * This is a global tonemapping operator that models human visual system.
 *
 * Mapping function is controlled by adaptation parameter, that is computed using light adaptation and
 * color adaptation.
 *
 * For more information see CITE: RD05 .
 */
public class TonemapReinhard extends Tonemap {

    protected TonemapReinhard(long addr) { super(addr); }

    // internal usage only
    public static TonemapReinhard __fromPtr__(long addr) { return new TonemapReinhard(addr); }

    //
    // C++:  float cv::TonemapReinhard::getIntensity()
    //

    // C++:  float cv::TonemapReinhard::getIntensity()
    private static native float getIntensity_0(long nativeObj);


    //
    // C++:  void cv::TonemapReinhard::setIntensity(float intensity)
    //

    // C++:  void cv::TonemapReinhard::setIntensity(float intensity)
    private static native void setIntensity_0(long nativeObj, float intensity);


    //
    // C++:  float cv::TonemapReinhard::getLightAdaptation()
    //

    // C++:  float cv::TonemapReinhard::getLightAdaptation()
    private static native float getLightAdaptation_0(long nativeObj);


    //
    // C++:  void cv::TonemapReinhard::setLightAdaptation(float light_adapt)
    //

    // C++:  void cv::TonemapReinhard::setLightAdaptation(float light_adapt)
    private static native void setLightAdaptation_0(long nativeObj, float light_adapt);


    //
    // C++:  float cv::TonemapReinhard::getColorAdaptation()
    //

    // C++:  float cv::TonemapReinhard::getColorAdaptation()
    private static native float getColorAdaptation_0(long nativeObj);


    //
    // C++:  void cv::TonemapReinhard::setColorAdaptation(float color_adapt)
    //

    // C++:  void cv::TonemapReinhard::setColorAdaptation(float color_adapt)
    private static native void setColorAdaptation_0(long nativeObj, float color_adapt);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public float getIntensity() {
        return getIntensity_0(nativeObj);
    }

    public void setIntensity(float intensity) {
        setIntensity_0(nativeObj, intensity);
    }

    public float getLightAdaptation() {
        return getLightAdaptation_0(nativeObj);
    }

    public void setLightAdaptation(float light_adapt) {
        setLightAdaptation_0(nativeObj, light_adapt);
    }

    public float getColorAdaptation() {
        return getColorAdaptation_0(nativeObj);
    }

    public void setColorAdaptation(float color_adapt) {
        setColorAdaptation_0(nativeObj, color_adapt);
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
