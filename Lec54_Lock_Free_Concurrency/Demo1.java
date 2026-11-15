import java.util.concurrent.atomic.AtomicInteger;

public class Demo1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=1;i<= 10000; i++){
                //System.out.println(Thread.currentThread().getName() + " "+counter.count);
                counter.increment();

            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<= 10000; i++){
                //System.out.println(Thread.currentThread().getName() + " "+counter.count);
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("Hello " + counter.count);
    }
}
//AtomicInteger
class Counter{
    // int count =0;
    AtomicInteger count = new AtomicInteger(0);

    void increment(){
        // count ++;
        count.incrementAndGet();
        // ya to thread iseh poora karega ya nahi
        
    }
}