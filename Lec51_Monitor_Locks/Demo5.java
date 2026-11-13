public class Demo5 {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        // Thread t1 = new Thread(() -> b1.depoisit());
        // Thread t2 = new Thread(() -> b1.withdraw());

        Thread t1 = new Thread(() -> b1.m1());
        Thread t2 = new Thread(() -> b1.m1());

        t1.start();
        t2.start();
    }
}

class Bank {
    
    Object lock1 = new Object();
    Object lock2 = new Object();

    void m1() {
        synchronized(new Object()) { // useless , now every thread can enter simultaneously with a new lock because every time thread came , a new obj will create
            System.out.println(Thread.currentThread().getName() + " Entered m1");

            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}

            System.out.println(Thread.currentThread().getName() + " Exiting m1");
        }
    }

    void depoisit() {
        synchronized(lock1) {
            System.out.println("Deposit logic");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}
        }
    }

    void withdraw() {
        synchronized(lock2) {
            System.out.println("Withdraw logic");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}
        }
    }
}