public class Demo8 {
    public static void main(String[] args) {
        
        // Thread t1 = new Thread(()->{
        //     while(true){
        //         System.out.println("Running");
        //     }
        // });

        // t1.start();
        // return;

        Thread t1 = new Thread(()->{
            while(true){
                System.out.println("Running");
            }
        });

        t1.setDaemon(true);
        t1.start();
        try {
            t1.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        return;
    }
}
