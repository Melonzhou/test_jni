#include "com_melon_learn_jnilearning_JNIClass.h"
JNIEXPORT jstring JNICALL Java_com_melon_learn_jnilearning_JNIClass_getNativeString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"MY JNI SUCCESS!");
  }