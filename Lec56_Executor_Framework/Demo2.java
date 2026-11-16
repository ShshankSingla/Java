import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {
    public static void main(String[] args) {
        
        // Future and Callable

        // 2 threads created in pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // submit threads future mei deta hai
        // take callable expression 
        Future<Integer> f1 = executor.submit(()->{

            // f1 mei output 3 second baad ayega, main thread will wait
            try{
                Thread.sleep(3000);
            }catch(Exception e){

            }
            return 10;

        });
        
        // main thread , f1 ka wait kar rahi hai
        try{
        // block the current executing thread until i get output of f1
            System.out.println(f1.get());
        }catch(Exception e){

        }

        executor.shutdown();
    }
}
