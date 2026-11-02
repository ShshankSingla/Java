// consumer chaining
import java.util.function.*;
public class Demo8 {
    public static void main(String[] args) {
        // when multiple consumers consume same thing
        // print(string)

        Consumer<String> printName = System.out::println;
        Consumer<String> printUpperCase = s-> System.out.println(s.toUpperCase());

        Consumer<String> pipeline = printName.andThen(printUpperCase);
        pipeline.accept("Shshank");
    }
}
