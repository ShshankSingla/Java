public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(() -> {
            System.out.println("Name of My first thread is: " + Thread.currentThread().getName());
            System.out.println("Id of My first thread is: " + Thread.currentThread().getId());
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Name of My second thread is: " + Thread.currentThread().getName());
            System.out.println("Id of My second thread is: " + Thread.currentThread().getId());
        });
        t2.start();


    }
}

// Thread Id and thread name
