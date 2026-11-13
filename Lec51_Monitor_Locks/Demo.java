public class Demo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                c1.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1;i<=10000;i++){
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        t2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        

        System.out.println(c1.count);
    }
}

class Counter{
    public int count =0;

    //now only one thread will enter at a time
    synchronized void increment(){
        count++;
    }
}
