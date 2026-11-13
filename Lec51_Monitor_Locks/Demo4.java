public class Demo4 {
    public static void main(String[] args) {
        // there is a single obj, if one thread enters into deposit, no other can withdraw
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
        synchronized(new Object()) {
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
            System.out.println("Withdra logic");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}
        }
    }
}