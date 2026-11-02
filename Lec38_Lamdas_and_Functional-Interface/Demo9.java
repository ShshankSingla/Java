import java.util.function.BiFunction;

public class Demo9 {
    public static void main(String[] args) {
        // BiFunction<T, U, R>
        BiFunction<Integer, Integer, Integer> add = (x,y)-> x+y;
        System.out.println(add.apply(5, 4));

        // same BiConsumer<T,U>, BiPredicate<T,U>
    }
}
