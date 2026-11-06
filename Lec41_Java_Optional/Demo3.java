import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {

        Optional<String> name = getName();

        if (name.isPresent()) {
            System.out.println(name.get());
        }

        System.out.println(name.orElseGet(() -> "Unknown"));

        System.out.println(name.orElseThrow(
            () -> new RuntimeException("Name not found")
        ));

        name.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Unknown")
        );
    }

    public static Optional<String> getName() {
        return Optional.ofNullable(null);
    }
}