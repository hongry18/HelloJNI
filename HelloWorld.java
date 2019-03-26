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
