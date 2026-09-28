public class AutoBoxing {
    public static void main(String[] args) {
        // auto boxing while assignment 
        int x = 10;
        Integer y = x;
        System.out.println(y); // unboxing

        // internal working as old java
        Integer a = new Integer(x);
        System.out.println(a);  // unboxing

        // internal working as per new java
        Integer b = Integer.valueOf(x);
        System.out.println(b); // unboxing


        // autoboxing while method call
        printInteger(50);
        

        // autoboxing while arithmetic opeations
        Integer m= 50;
        Integer n = 60;
        int sum = m+n;
        System.out.println(sum);
    }

    static void printInteger(Integer x){
        System.out.println(x);
    }

    
}
