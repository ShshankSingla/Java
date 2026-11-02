// predicate chaining
import java.util.function.*;
public class Demo6 {
    public static void main(String[] args) {
        // and(), or(), negate()
        Predicate<Integer> isGreater = x-> x>100;
        Predicate<Integer> isEven = x -> x%2 ==0;

        Predicate<Integer> result = isGreater.and(isEven);
        System.out.println(result.test(2));

        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(55));
    }
}
