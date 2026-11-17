import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo3 {
    public static void main(String[] args) {
        // Thread t1 = new Thread(() -> {
        //     System.out.println(Thread.currentThread().getName());
        // });
        // t1.start(); // by this our thread from jvm liked with os (one to one) and occupy that thread even went into the blocked phase

        Thread t1 = Thread.startVirtualThread(() ->{
            System.out.println(Thread.currentThread()+" says hello");
        });

        try{ // if we don't put join here , our main thread(OS) will not wait for it because it is virtual
            t1.join(); // wait for t1 to complete
        }catch(InterruptedException e){}

        // better way to make virtual threads
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for(int i=1;i<=5; i++){
            executor.submit(()->{
                System.out.println("Task executed by " + Thread.currentThread());
            });
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        executor.shutdown();
    }
}
