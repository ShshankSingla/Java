public class Demo4 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() ->{
            System.out.println("Current thread is "+ Thread.currentThread().getName());
        });

        //t1.start(); // this print the new Thread
        t1.run();  // this alone print main
    }
}
