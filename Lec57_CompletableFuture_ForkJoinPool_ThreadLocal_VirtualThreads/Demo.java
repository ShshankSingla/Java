import java.util.concurrent.CompletableFuture;

public class Demo {
    public static void main(String[] args) {
        // CompletableFuture<Integer>f1 = CompletableFuture.supplyAsync(()-> 10);

        // the below is still blocking the system
        // try{
        //     System.out.println(f1.get());
        // }catch(Exception e){
            
        // }

        CompletableFuture<Integer>f1 = CompletableFuture.supplyAsync(()-> 10)
                                        .thenApply(result -> result*2)
                                        .thenApply(result -> result*3);  // 60
        
        // async, instant output
        CompletableFuture<Void>f2 = CompletableFuture.supplyAsync(() -> 10)
                                        .thenAccept( result -> System.out.println(result)); // 10
        
        CompletableFuture<Void>f3 = CompletableFuture.supplyAsync(()-> 10)
                                        .thenRun(() -> System.out.println("Done"));
        
        CompletableFuture<Integer> f4 = CompletableFuture.supplyAsync(()-> 10);
        CompletableFuture<Integer> f5 = CompletableFuture.supplyAsync(()-> 20);
        CompletableFuture<Void> result = f4.thenCombine(f5,(a,b) -> a+b)
                                            .thenAccept(result1 -> System.out.println(result1) );



        try{
            System.out.println(f1.get());
            
        }catch(Exception e){}
    }
    // fork join pool executor
}
