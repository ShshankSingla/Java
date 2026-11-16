
import java.util.List;
import java.util.concurrent.*;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<Callable<Integer>> tasks = List.of(
            () -> 10,
            () -> 20,
            () -> 30
        );

        List<Future<Integer>> futures = executor.invokeAll(tasks);

        for (Future<Integer> f : futures) {
            System.out.println(f.get());
        }

        executor.shutdown();
    }
}
