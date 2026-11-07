public class Demo2 {
    // Exception handling in chain of methods
    public static void main(String[] args) {
        System.out.println("step 1");
        int a = 4;
        int b = 0;
        methodA(a, b);
    }

    private static void methodA(int a, int b){
        System.out.println("step2");
        try {
            methodB(a,b);
        } catch (Exception e) {
            System.out.println(e);

            e.printStackTrace();
        }
        System.out.println("step4");
    }

    private static void methodB(int a ,int b){
        System.out.println(a/b);

        //unreachable
        System.out.println("step 3");
    }
}
