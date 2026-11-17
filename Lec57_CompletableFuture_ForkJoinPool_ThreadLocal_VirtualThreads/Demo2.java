import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        // make our self executor - can also make from ExecutorService
        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(arr, 0, arr.length-1);

        int result = pool.invoke(task);
        System.out.println(result);
        pool.shutdown();
    }
}

// Fork join pool executor
class SumTask extends RecursiveTask<Integer>{
    
    private int[] arr;
    private int start;
    private int end;

    public SumTask(int [] arr,int start, int end ){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute(){
        // base condition
        if(end - start <=2){
            int sum =0;
            for(int i= start; i<= end;i++){
                sum += arr[i];
            }
            return sum;
        }
        // main logic - > fork

        int mid = start + (end-start)/2;
        // start -> mid  , mid+1 -> end
        SumTask leftTask = new SumTask(arr,start, mid);
        SumTask rightTask = new SumTask(arr,mid+1,end);

        leftTask.fork(); // left Task in work stealing queue- do it later
        
        
        int sum2 = rightTask.compute(); // perform right task
        int sum1 = leftTask.join(); // wait for leftTask to execute

        return sum1+ sum2;


        // join
    }
}
