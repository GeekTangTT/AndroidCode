

#include<jni.h>
#include<string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ndk_jni_NativeFun_stringFromJNI(JNIEnv *env, jclass type) {

    // TODO

    std::string hello="hello,I from C++";
    return env->NewStringUTF(hello.c_str());
}