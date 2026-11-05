
import java.util.*;
import java.util.stream.Collectors;

public class Demo3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
            List.of(1, 13, 11, 9, 14)
        );


        // 1. Collectors.toList()
        // Collects stream elements into a List.
        // Maintains encounter order.

        List<Integer> list2 = list.stream()
            .map(x -> x + 1)
            .collect(Collectors.toList());

        System.out.println("List: " + list2);


        // 2. Collectors.toSet()
        // Collects elements into a Set.
        // Removes duplicate elements.
        // Does not guarantee encounter order.

        Set<Integer> set = list.stream()
            .map(x -> x + 1)
            .collect(Collectors.toSet());

        System.out.println("Set: " + set);


        List<String> list3 = new ArrayList<>(
            List.of("AA", "BB", "CCCC", "DD", "EEE")
        );


        // 3. Collectors.toMap()
        // Converts stream elements into key-value pairs.
        // First argument represents KEY.
        // Second argument represents VALUE.
        // Third argument is a merge function.
        // It handles duplicate keys by combining their values.

        Map<Integer, String> map = list3.stream()
            .collect(Collectors.toMap(
                x -> x.length(),
                x -> x,
                (a, b) -> a + ", " + b
            ));

        System.out.println("Map: " + map);


        // 4. Collectors.groupingBy()
        // Groups elements based on a classification function.
        // Here, strings are grouped according to their length.
        // Multiple values can belong to the same key.

        Map<Integer, List<String>> map1 = list3.stream()
            .collect(Collectors.groupingBy(
                x -> x.length()
            ));

        System.out.println("Grouping By: " + map1);


        // 5. Collectors.partitioningBy()
        // Divides elements into exactly two groups:
        // true  -> Elements satisfying the condition.
        // false -> Elements not satisfying the condition.
        // Here, numbers are divided into even and odd groups.

        Map<Boolean, List<Integer>> map2 = list.stream()
            .collect(Collectors.partitioningBy(
                x -> x % 2 == 0
            ));

        System.out.println("Partitioning By: " + map2);


        // 6. Collectors.mapping()
        // Transforms elements before passing them to another collector.
        // Here, strings are first grouped by length,
        // then converted to lowercase and collected into a List.

        Map<Integer, List<String>> map3 = list3.stream()
            .collect(Collectors.groupingBy(
                x -> x.length(),
                Collectors.mapping(
                    x -> x.toLowerCase(),
                    Collectors.toList()
                )
            ));

        System.out.println("Grouping with Mapping: " + map3);


        // 7. Collectors.joining()
        // Concatenates all String elements into one String.
        // The specified delimiter is placed between elements.

        String result = list3.stream()
            .collect(Collectors.joining("-"));

        System.out.println("Joining: " + result);


        // 8. Collectors.counting()
        // Counts the number of elements in each group.
        // Here, we count strings having the same length.

        Map<Integer, Long> countMap = list3.stream()
            .collect(Collectors.groupingBy(
                x -> x.length(),
                Collectors.counting()
            ));

        System.out.println("Counting: " + countMap);


        // 9. Collectors.summarizingInt()
        // Calculates multiple statistics in one operation:
        // Count, Sum, Minimum, Maximum and Average.

        IntSummaryStatistics stats = list.stream()
            .collect(Collectors.summarizingInt(x -> x));

        System.out.println("Statistics: " + stats);

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());

    }
}
