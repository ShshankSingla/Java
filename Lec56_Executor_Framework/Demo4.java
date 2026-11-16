import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo4 {
    public static void main(String[] args) {
     
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // can't catch the exception
        executor.execute(() ->{
            int x =10/0;

            // can use thread Factory
        });

        Future<Integer> f1 = executor.submit(()->{
            return (10/0);
        });

        try {
            System.out.println(f1.get());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("catched submit() exception");
        }
    }
}
