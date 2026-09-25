public class StaticAndFinal {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.PI); 
    }
    
}

class Random{
    static final double PI;

    static{
        PI = 3.14;
    }
}
