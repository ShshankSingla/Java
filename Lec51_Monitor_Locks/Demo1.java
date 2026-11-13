public class Demo1 {
    public static void main(String[] args) {

        Test test = new Test();

        Thread t1 = new Thread(() -> test.show());

        Thread t2 = new Thread(() -> test.show());

        t1.start();
        t2.start();
    }
}

class Test {

    // void show() {
    //     System.out.println(Thread.currentThread().getName() + "Inside show");

    //     try {
    //         Thread.sleep(2000);
    //     }
    //     catch(Exception e) {}

    //     System.out.println(Thread.currentThread().getName() + "Show finish");
    // }

    // o/p
    /*
    Thread-0Inside show
    Thread-1Inside show
    Thread-0Show finish
    Thread-1Show finish
     */

    synchronized void show() {
        System.out.println(Thread.currentThread().getName() + "Inside show");

        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {}

        System.out.println(Thread.currentThread().getName() + "Show finish");
    }

    /*
    Thread-0Inside show
    Thread-0Show finish
    Thread-1Inside show
    Thread-1Show finish
    */
}