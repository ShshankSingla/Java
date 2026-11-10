public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

// thread class
class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}
