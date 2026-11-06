import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        // Creation

        // Optional<String> n = Optional.of(null); // NullPointerException
        Optional<String> n = Optional.of("Aditya");

        System.out.println(n);
        n.ifPresent(System.out::println);

        Optional<String> n1 = Optional.ofNullable("Aditya");
        Optional<String> n2 = Optional.ofNullable(null);

        n1.ifPresent(System.out::println);
        n2.ifPresent(System.out::println);

        // Creating an empty Optional
        Optional<String> n3 = Optional.empty();
        n3.ifPresent(System.out::println);
    }
}