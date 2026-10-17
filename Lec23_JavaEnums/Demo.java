public class Demo {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;

        System.out.println(status);
    }
}

// payment status -> success, failed, pending
// final

class PaymentStatus{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3; 
}