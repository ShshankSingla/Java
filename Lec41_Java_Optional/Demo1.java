import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {

        Optional<String> employee =
                Optional.ofNullable(null);

        String result = employee.orElse("Employee Not Found");

        System.out.println(result);
    }
}