
import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {

        // TERMINAL OPERATIONS IN JAVA STREAMS

        List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));


        // 1. forEach()
        // forEach() performs an action on each element of the stream.
        // It is a terminal operation and triggers stream execution.
        // The order of execution is not guaranteed for parallel streams.

        list.stream()
            .map(x -> x + 1)
            .forEach(System.out::println);

        System.out.println();


        // 2. forEachOrdered()
        // forEachOrdered() processes elements in their encounter order.
        // It is useful when maintaining the original order is important,
        // especially when working with parallel streams.

        list.stream()
            .map(x -> x + 1)
            .forEachOrdered(System.out::println);

        System.out.println();


        // 3. toList()
        // toList() collects stream elements into an unmodifiable List.
        // It was introduced in Java 16.
        // The returned list cannot be modified.

        List<Integer> list2 = list.stream()
            .map(x -> x + 1)
            .toList();

        System.out.println(list2);


        // 4. collect()
        // collect() is used to accumulate stream elements into a collection
        // or another result container.
        // Collectors.toList() creates a mutable List.

        List<Integer> list3 = list.stream()
            .map(x -> x + 1)
            .collect(Collectors.toList());

        System.out.println(list3);


        // Collecting elements into a Set.
        // A Set does not allow duplicate elements.

        Set<Integer> set = list.stream()
            .map(x -> x + 1)
            .collect(Collectors.toSet());

        System.out.println(set);
        System.out.println();


        // 5. reduce()
        // reduce() combines all stream elements into a single result.
        // It takes a BinaryOperator that combines two elements at a time.
        // Without an identity value, it returns Optional<T> because
        // the stream might be empty.

        Optional<Integer> sum = list.stream()
            .reduce((a, b) -> a + b);

        System.out.println("Sum: " + sum.orElse(0));


        // reduce() with an identity value.
        // The identity value is 0 here.
        // It returns an int/Integer directly, not an Optional.

        int sum2 = list.stream()
            .reduce(0, (a, b) -> a + b);

        System.out.println("Sum with identity: " + sum2);


        // 6. count()
        // count() returns the total number of elements in the stream.
        // It returns a long value.
        // Here, we count elements greater than 10.

        long cnt = list.stream()
            .filter(x -> x > 10)
            .count();

        System.out.println("Count: " + cnt);


        // 7. findFirst()
        // findFirst() returns the first element of the stream.
        // It returns Optional<T> because the stream might be empty.
        // It is a short-circuiting terminal operation.

        Optional<Integer> num = list.stream()
            .filter(x -> x > 10)
            .findFirst();

        System.out.println("First element: " + num.orElse(-1));


        // 8. findAny()
        // findAny() returns any one element from the stream.
        // It is particularly useful with parallel streams.
        // It is also a short-circuiting terminal operation.

        Optional<Integer> num1 = list.stream()
            .filter(x -> x > 10)
            .findAny();

        System.out.println("Any element: " + num1.orElse(-1));


        // 9. anyMatch()
        // anyMatch() checks whether at least one element satisfies
        // the given Predicate condition.
        // It returns a boolean value.
        // It is a short-circuiting terminal operation.

        boolean num2 = list.stream()
            .filter(x -> x > 10)
            .anyMatch(x -> x % 2 == 0);

        System.out.println("Any even number: " + num2);


        // 10. allMatch()
        // allMatch() checks whether every element satisfies
        // the given Predicate condition.
        // It returns true only if all elements satisfy the condition.

        boolean num3 = list.stream()
            .filter(x -> x > 10)
            .allMatch(x -> x % 2 == 0);

        System.out.println("All are even: " + num3);


        // 11. noneMatch()
        // noneMatch() checks whether no element satisfies
        // the given Predicate condition.
        // It returns true if no element matches the condition.

        boolean num4 = list.stream()
            .filter(x -> x > 10)
            .noneMatch(x -> x % 2 == 0);

        System.out.println("None are even: " + num4);


        // 12. mapToInt()
        // mapToInt() converts a Stream<Integer> into an IntStream.
        // IntStream provides primitive operations such as sum(), max(),
        // min() and average() without requiring Optional<Integer> for sum.

        int sum3 = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .sum();

        System.out.println("Primitive sum: " + sum3);


        // 13. max()
        // max() returns the maximum element from an IntStream.
        // It returns OptionalInt because the stream might be empty.

        OptionalInt maxi = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .max();

        System.out.println("Maximum: " + maxi.orElse(-1));


        // 14. min()
        // min() returns the minimum element from an IntStream.
        // It returns OptionalInt because the stream might be empty.

        OptionalInt mini = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .min();

        System.out.println("Minimum: " + mini.orElse(-1));


        // 15. average()
        // average() calculates the arithmetic mean of stream elements.
        // It returns OptionalDouble because the stream might be empty.

        OptionalDouble avg = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .average();

        System.out.println("Average: " + avg.orElse(0.0));

    }
}
