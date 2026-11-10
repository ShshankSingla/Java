// public class Demo4 {
//     public static void main(String[] args) {

//         Thread t1 = new Thread(() -> {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.println("Thread: " + i);
//             }
//         });

//         t1.start();

//         t1.interrupt(); // this just make the flag true, but doesn't stop the execution
//     }
// }

public class Demo4{
    public static void main(String[] args) {
        
        Thread t1 = new Thread(()->{

            while( !Thread.currentThread().isInterrupted()){
                System.out.println("Running");
            }
        });

        // t1.start();
        // t1.interrupt();

        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        t1.interrupt();
    }
}

// public class Demo4 {
//     public static void main(String[] args) {

//         Thread t1 = new Thread(() -> {
//             try {
//                 System.out.println("Thread started");

//                 Thread.sleep(10000);

//                 System.out.println("Thread completed");

//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted!");
//             }
//         });

//         t1.start();

//         try {
//             Thread.sleep(2000);
//         } catch (InterruptedException e) {}

//         t1.interrupt();
//     }
// }