public class Demo3 {
    public static void main(String[] args) {
        Box box = new Box();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=20; i++) {
                try{
                    Thread.sleep(100);
                }
                catch(Exception e) {}
                box.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=20; i++) {
                try{
                    Thread.sleep(70);
                }
                catch(Exception e) {}
                box.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}

class Box {
    volatile Integer item;
    volatile Boolean flag = false;

    synchronized void producer(int value) {

        while(flag == true) { // value already present
            // do nothing
        }

        item = value;
        flag = true;
        System.out.println("Producer produces " + item);
    }

    synchronized void consumer() {

        while(flag == false) {
            // do nothing
        }

        System.out.println("Consumer consumes " + item);
        item = null;
        flag = false;
    }

    // if consumer run first, initially flag value is false, enters into loop of consumer
    // remain in infinite loop and lock the object
}