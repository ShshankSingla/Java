public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() ->{
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
            System.out.println("Thread-0 starts");
        });

        t1.start();

        try{
            t1.join(); // The currently executing thread must wait until thread t1 completes its execution.
        }catch(InterruptedException e){}

        System.out.println("Main thread ends");
    }
}
