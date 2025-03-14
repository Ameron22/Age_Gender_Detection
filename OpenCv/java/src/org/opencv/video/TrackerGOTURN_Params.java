//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;



// C++: class Params

public class TrackerGOTURN_Params {

    protected final long nativeObj;
    protected TrackerGOTURN_Params(long addr) { nativeObj = addr; }

    public TrackerGOTURN_Params() {
        nativeObj = TrackerGOTURN_Params_0();
    }

    // internal usage only
    public static TrackerGOTURN_Params __fromPtr__(long addr) { return new TrackerGOTURN_Params(addr); }

    //
    // C++:   cv::TrackerGOTURN::Params::Params()
    //

    // C++:   cv::TrackerGOTURN::Params::Params()
    private static native long TrackerGOTURN_Params_0();


    //
    // C++: string TrackerGOTURN_Params::modelTxt
    //

    // C++: string TrackerGOTURN_Params::modelTxt
    private static native String get_modelTxt_0(long nativeObj);


    //
    // C++: void TrackerGOTURN_Params::modelTxt
    //

    // C++: void TrackerGOTURN_Params::modelTxt
    private static native void set_modelTxt_0(long nativeObj, String modelTxt);


    //
    // C++: string TrackerGOTURN_Params::modelBin
    //

    // C++: string TrackerGOTURN_Params::modelBin
    private static native String get_modelBin_0(long nativeObj);


    //
    // C++: void TrackerGOTURN_Params::modelBin
    //

    // C++: void TrackerGOTURN_Params::modelBin
    private static native void set_modelBin_0(long nativeObj, String modelBin);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    public long getNativeObjAddr() { return nativeObj; }

    public String get_modelTxt() {
        return get_modelTxt_0(nativeObj);
    }

    public void set_modelTxt(String modelTxt) {
        set_modelTxt_0(nativeObj, modelTxt);
    }

    public String get_modelBin() {
        return get_modelBin_0(nativeObj);
    }

    public void set_modelBin(String modelBin) {
        set_modelBin_0(nativeObj, modelBin);
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
