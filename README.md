# JNI Hello World

## generate HelloWorld.java
```java
public class HelloWorld {
    public native void hello();
}
```

## compile and generate header
```
javac HelloWorld.java
javah -jni HelloWorld
```

## generate HelloWorld.c
```C
#include "HelloWorld.h"

JNIEXPORT void JNICALL Java_HelloWorld_hello(JNIEnv *env, jobject jobj) {
    printf("hello jni\n");
}
```

## compile HelloWorld.c
```
gcc HelloWorld.c -shared -I $JAVA_HOME/include -o libhelloworld.dylib

# extensions
## linux .so
## osx .dylib
## old osx .jnilib
## windows .dll
```

## edit HelloWorld
```java
public class HelloWorld {
    static {
        System.loadLibrary("helloworld");
    }
    public native void hello();

    public static void main(String[] ar) {
        HelloWorld w = new HelloWorld();
        w.hello();
    }
}
```

## recompile HelloWorld.java and execute
```
javac HelloWorld.java
java HelloWorld
```
