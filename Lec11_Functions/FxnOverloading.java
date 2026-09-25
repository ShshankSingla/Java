import java.util.*;

public class FxnOverloading{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(add(5,6,7));

        sc.close();
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}