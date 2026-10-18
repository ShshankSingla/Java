public class Demo1 {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();
    }
    
}


// polymorphism

interface Payment{
    void pay();
}

class CreditCard implements Payment{

    @Override
    public void pay(){
        System.out.println("Paying via Credit Card");
    }
}

class DebitCard implements Payment{

    @Override
    public void pay(){
        System.out.println("Payment via Debit Card");
    }
}

