public class Demo {
    public static void main(String[] args) {

        Counter c1 = new Counter();

        Thread t1 = new Thread(() ->{
            c1.increment();          
        });

        Thread t2 = new Thread(() ->{
            c1.increment();          
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

        System.out.println(c1.count);


    }
}


class Counter{
    public int count =0;

    public void increment(){
        count++;
    }
}