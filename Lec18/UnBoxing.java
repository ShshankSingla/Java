public class UnBoxing {
    public static void main(String[] args) {
        
        // unboxing while assignment
        Integer y= 10;
        int x = y;

        System.out.println(x);

        // internal working
        int a = y.intValue();
        System.out.println(a);

        // unboxing while method call
        Integer m = 50;
        printInteger(m);

        // handling exception
        Integer p = null;

        try {
            int z = p;   // Integer → int (unboxing)
            System.out.println(z);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
        }
        
    }
    
    static void printInteger(int val){
        System.out.println(val);
    }

}
