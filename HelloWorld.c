#include "HelloWorld.h"

JNIEXPORT void JNICALL Java_HelloWorld_hello(JNIEnv *env, jobject jobj) {
    printf("hello jni\n");
}
