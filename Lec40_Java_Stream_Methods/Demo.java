
import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
            List.of(1, 34, 13, 11, 4, 62, 34, 13)
        );

        // 1. FILTER
        // filter() is used to select elements that satisfy a condition.
        // It takes a Predicate (returns true or false).
        // Here, we first select elements greater than 10,
        // and then select only even elements.

        list.stream()
            .filter(x -> x > 10)
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);

        System.out.println();


        // 2. MAP
        // map() is used to transform each element into another value.
        // It takes a Function as an argument.
        // Here, every element greater than 10 is multiplied by 2.

        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .forEach(System.out::println);

        System.out.println();


        // 3. FLATMAP
        // flatMap() is used to flatten nested collections into a single stream.
        // It converts each inner collection into a stream
        // and combines all elements into one stream.

        List<List<Integer>> list2 = List.of(
            List.of(1, 2),
            List.of(3, 4)
        );

        list2.stream()
            .flatMap(x -> x.stream())
            .map(x -> x * 2)
            .forEach(System.out::println);

        System.out.println();


        // 4. SORTED
        // sorted() is used to sort elements in ascending order by default.
        // We can also provide a Comparator to define custom sorting.
        // (a, b) -> b - a sorts elements in descending order.

        // Ascending order
        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .sorted()
            .forEach(System.out::println);

        System.out.println();

        // Descending order
        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .sorted((a, b) -> Integer.compare(b, a))
            .forEach(System.out::println);

        System.out.println();


        // 5. DISTINCT
        // distinct() removes duplicate elements from the stream.
        // It uses equals() to identify duplicate elements.
        // Here, duplicate values are removed after mapping.

        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .distinct()
            .forEach(System.out::println);

        System.out.println();


        // 6. LIMIT AND SKIP
        // limit(n) restricts the stream to its first n elements.
        // skip(n) skips the first n elements of the stream.
        // These are particularly useful when working with large or infinite streams.

        // Stream.iterate() generates an infinite sequence.
        // limit(10) prevents infinite execution by restricting it to 10 elements.

        Stream.iterate(1, x -> x + 1)
            .limit(10)
            .forEach(System.out::println);

        System.out.println();

        // First generate 10 elements, then skip the first 5.
        // Output: 6, 7, 8, 9, 10

        Stream.iterate(1, x -> x + 1)
            .limit(10)
            .skip(5)
            .forEach(System.out::println);

        System.out.println();


        // 7. PEEK
        // peek() is mainly used for debugging and inspecting stream elements.
        // It performs an action on each element as it passes through the stream.
        // It does not transform the elements.
        // Here, elements are printed before sorting.
        // sorted() then sorts them, and forEach() prints the sorted result.

        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .peek(x -> System.out.println("Before sorting: " + x))
            .sorted()
            .forEach(x -> System.out.println("After sorting: " + x));

        System.out.println();
    }
}
