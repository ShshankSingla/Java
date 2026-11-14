public class Demo {
    public static void main(String[] args) {
        Box box = new Box();

        Thread t1 = new Thread(()-> box.producer(10));
        Thread t2 = new Thread(()->box.consumer());

        

        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

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
