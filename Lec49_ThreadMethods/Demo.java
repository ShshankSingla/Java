public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread Starts");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}

        System.out.println("Main Thread ends");
    }
}
