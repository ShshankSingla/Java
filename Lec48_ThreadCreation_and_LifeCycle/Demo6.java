public class Demo6 {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        
        Thread t1 = new Thread(() -> {
            System.out.println("Name of current thread is : "+ Thread.currentThread().getName());
            System.out.println("Main thread state "+ mainThread.getState());
        });

        System.out.println(t1.getState()); // NEW

        //Runnable stage
        t1.start();  // main thread go on sleep 
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED

        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println(t1.getState()); // RUNNABLE/TERMINATED


    }
}

// Thread Lifecycle
