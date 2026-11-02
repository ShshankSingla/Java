public class Demo {
    public static void main(String[] args) {
        // Calculator c = new Addition();
        // int sum = c.calculate(5,4);
        // System.out.println(sum);

        // print(5,4,c);   

        print(5,4, (a,b)-> a+b );
    }

    public static void print( int a, int b, Calculator c){
        System.out.println(c.calculate(a, b));
    }
}

@FunctionalInterface
interface Calculator{
    public int calculate(int a, int b);
}

// class Addition implements Calculator{
//     // int a;
//     // int b;

//     // public Addition(int a, int b){
//     //     this.a = a;
//     //     this.b = b;
//     // }

//     @Override
//     public int calculate(int a, int b){
//         return a+b;
//     }

// }
