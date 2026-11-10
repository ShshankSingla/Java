public class Demo7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Custom thread running");
        });

        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(10);
        System.out.println(t1.getPriority());

    
    }
}
