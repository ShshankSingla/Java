import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
    public static void main(String[] args) {
        SeatBooking sb = new SeatBooking();
        Thread t1 = new Thread(()->sb.bookSeat("Aditya"));
        Thread t2 = new Thread(()->sb.bookSeat("Rohit"));

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(sb.seat);

    }
}

class SeatBooking{
    //String seat = new String("EMPTY");
    AtomicReference<String> seat = new AtomicReference<>("EMPTY"); 


    // boolean bookSeat(String name){
    //     if(seat.equals("EMPTY")){
    //         seat = new String(name);
    //         return true;
    //     }

    //     return false;
    // }

    // now we use compare and set operation
    boolean bookSeat(String name){
        String currentValue = seat.get();

        // already seat assign
        if(currentValue.equals("EMPTY") == false){
            return false;
        }

        // current value empty
        return seat.compareAndSet("EMPTY",name); // expected value, current value
    }
}
