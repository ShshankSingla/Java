public class Demo5 {
    public static void main(String[] args) {
        // int y = getResult(5);
        // System.out.println(y);

        // // object method
        // Integer z1 = (Integer)getResult(5);
        // System.out.println(z1);
        // String z2 = (String)getResult("Hello");
        // System.out.println(z2);

        Integer x = getResult(10); 
        String y = getResult("Hello");
        System.out.println(x + " " + y);

        printPair(10, "Value");
    }

    // public static int getResult(int x){
    //     return x+5;
    // }

    // public static Object getResult(Object x){
    //     // return x+5; can't perfom operatons onn object direclty
    //     return x;
    // }

    public static <T> T getResult(T x){// <T> type parameter
        
        return x;
    }

    public static <T,U> void printPair(T first, U second){
        System.out.println(first + ", " + second);
    }
}

// generic methods

