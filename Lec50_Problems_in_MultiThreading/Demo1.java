// we are trying to implement race condition
public class Demo1 {
    public static void main(String[] args) {

        Counter c1 = new Counter();

        Thread t1 = new Thread(() ->{
            for(int i=1;i<= 10000;i++){
                c1.increment();  
            }        
        });

        Thread t2 = new Thread(() ->{
            for(int i=1;i<= 10000;i++){
                c1.increment();  
            }          
        });

        t1.start();
        t2.start();

        System.out.println(c1.count);

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        System.out.println(c1.count);// expected 20,000, if outcome is less then there must be race condition


    }
}


class Counter{
    public int count =0;

    //critical section
    public void increment(){
        // shared resource
        count++;
    }
}

// critical section - shared area by multiple threads