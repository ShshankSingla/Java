public class Demo5 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        });
        System.out.println(t1.isAlive()); // false

        t1.start();

        System.out.println(t1.isAlive()); // true

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(t1.isAlive()); // false;
    }
}
