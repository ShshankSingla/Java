import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;


public class Demo {
    public static void main(String[] args) {
        LikeCounter likeCounter = new LikeCounter();

        Thread t1 = new Thread(() -> likeCounter.like());
        Thread t2 = new Thread(() -> likeCounter.like());
        Thread t3 = new Thread(() -> likeCounter.like());
        Thread t4 = new Thread(() -> likeCounter.like());
        Thread t5 = new Thread(() -> likeCounter.like());
        Thread t6 = new Thread(() -> likeCounter.like());
        Thread t7 = new Thread(() -> likeCounter.like());
        Thread t8 = new Thread(() -> likeCounter.like());
        Thread t9 = new Thread(() -> likeCounter.like());
        Thread t10 = new Thread(() -> likeCounter.like());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){

        }

        System.out.println("Total likes "+likeCounter.getTotalLikes());
    }
}

class LikeCounter{
    AtomicReference<Integer> totalCount = new AtomicReference<>(0);

    public void like(){
        // this statment can produce race condition 
        // totalCount.set(totalCount.get()+1)

        Integer currentCount;
        Integer finalCount;
        while(true){
            //1. we will capture the latest value of totalCount
            currentCount = totalCount.get(); // expected value

            //2. increment the like counter by 1
            finalCount = currentCount + 1;

            // 3. check  again if the count is still what i saw
            if(totalCount.compareAndSet(currentCount, finalCount)){
                return ; 
            }
            // compare totalCount with currentCount
            // if equal set totalCount value to finalCount
            // otherwise not

            // 4. if a thread reaches here, someone else have updated their counter value
            // Re-try
            System.out.println("Conflict detected. Re-trying...");

        }
    }

    public int getTotalLikes(){
         return totalCount.get();
    }
}

