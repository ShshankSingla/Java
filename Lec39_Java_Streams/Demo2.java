import java.util.*;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(List.of(5,12,7,14));

        Stream<Integer> s = list.stream();
        s= s.filter(x-> x>10);
        s = s.map(x-> x*2);
        s.forEach(System.out::println);

    }
}
