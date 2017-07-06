package com.melon.learn.jnilearning;

/**
 * Created by Melon on 2017/7/6.
 */

public class JNIClass {

    static {
        System.loadLibrary("hello-jni");
    }
    public native String getNativeString();
}
