import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,7,4,5,6));

        // sequential stream
        list.stream()
            .map(x -> x*2)
            .forEach(System.out::println); 
        System.out.println();
        
        list.parallelStream()
            .map(x -> x*2)
            .forEach(System.out::println);
        System.out.println();

        list.parallelStream()
            .map(x -> x*2)
            .forEachOrdered(System.out::println);
        System.out.println();
        // use join and fork
    }
}
