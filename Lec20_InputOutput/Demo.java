import java.util.Scanner;
import java.io.IOException;

public class Demo{
    public static void main(String[] args) throws IOException{
        System.out.println("Hello");
        System.err.println("Bye");

        
        int x = System.in.read();
        System.out.println(x);

        // input from user
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}