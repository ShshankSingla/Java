import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        // terminal oper

        List<Integer> list = new ArrayList<>(List.of(1,13,11,9));

        list.stream()
            .map(x -> x+1)
            .forEach(System.out::println);

            System.out.println();
        list.stream()
            .map(x -> x+1)
            .forEachOrdered(System.out::println);

            // toList
        List<Integer> list2 = list.stream()
            .map(x -> x+1)
            .toList();
        System.out.println(list2);

        // 4. collect()
        List<Integer> list3 = list.stream()
            .map(x -> x+1)
            .collect(Collectors.toList());
        System.out.println(list3);


        Set<Integer> set = list.stream()
            .map(x -> x+1)
            .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println();

        // reduce
        Optional<Integer> sum = list.stream()
            .reduce((a,b)->a+b);
        System.out.println(sum.get());

        int sum2 = list.stream()
            .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        // count 
        long cnt = list.stream()
            .filter(x-> x>10)
            .count();
        System.out.println(cnt);

        // findFirst - > shortcircuiting
        Optional<Integer>num = list.stream()
            .filter(x-> x>10)
            .findFirst();
        System.out.println(num.get());

        // findAny()
        Optional<Integer>num1 = list.stream()
            .filter(x-> x>10)
            .findFirst();
        System.out.println(num1.get());

        // anyMatch , take Predicate condition return boolean
        boolean num2 = list.stream()
            .filter(x-> x>10)
            .anyMatch(x -> x%2 ==0);
        System.out.println(num2);

        // allMatch , take Predicate condition return boolean
        boolean num3 = list.stream()
            .filter(x-> x>10)
            .allMatch(x -> x%2 ==0);
        System.out.println(num3);

        // noneMatch , take Predicate condition return boolean
        boolean num4 = list.stream()
            .filter(x-> x>10)
            .noneMatch(x -> x%2 ==0);
        System.out.println(num4);

        //mapToInt  -> primitive Stream, sum(),
        int sum3 = list.stream()
            .filter(x -> x>10)
            .mapToInt(x -> x)
            .sum();
        System.out.println(sum3);

        //mapToInt  -> primitive Stream, max(),
        OptionalInt maxi = list.stream()
            .filter(x -> x>10)
            .mapToInt(x -> x)
            .max();
        System.out.println(maxi.getAsInt());

        // avg
        OptionalDouble avg = list.stream()
            .filter(x -> x>10)
            .mapToInt(x -> x)
            .average();
        System.out.println(avg.getAsDouble());


        

    }
}
