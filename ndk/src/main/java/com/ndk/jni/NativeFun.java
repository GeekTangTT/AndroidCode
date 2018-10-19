package com.ndk.jni;

public class NativeFun {
    static{
        System.loadLibrary("native_hello");
    }

    public static native String stringFromJNI();

}
