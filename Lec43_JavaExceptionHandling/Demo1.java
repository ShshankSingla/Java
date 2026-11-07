public class Demo1 {
    // stack trace
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        methodA(a,b);
    }

    public static void methodA(int a, int b){
        methodB(a,b);
    }

    public static void methodB(int a, int b){
        // syntax : className.methodName
        System.out.println(a/b);
    }
}
