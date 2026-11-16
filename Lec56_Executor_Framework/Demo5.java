import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo5 {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(2);
        // now we self made it

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2, 
            5, 
            10, 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<>(2));

        for(int i=1 ;i<=5;i++){
            int taskId = i;

            executor.execute(()->{
                System.out.println("Task" + taskId +" is performed by "+ Thread.currentThread().getName());

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            });

            
        }

        executor.shutdown();
    }
}
