public class Demo1 {
    public static void main(String[] args) {
        Box box = new Box();

        Thread t1 = new Thread(()-> {
            for(int i=1;i<=20;i++){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){

                }
                box.producer(i);
            }
        });

        Thread t2 = new Thread(()->{
            // consumer is consuming fast, chances of consuming null
            for(int i=1;i<=20;i++){
                try{
                    Thread.sleep(70);
                }catch(InterruptedException e){

                }
                box.consumer();
            }

        });

        

        

        t1.start();
        t2.start();
    }
}

class Box{
    Integer item;
    Boolean flag = false;

    void producer(int value){
        item = value;
        flag = true;

        System.out.println("Producer produces: "+item);
    }

    void consumer(){
        System.out.println("Consumer consumes: "+item);
        item = null;
        flag = false;
    }

}
