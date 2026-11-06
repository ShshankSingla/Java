import java.util.Optional;

public class Demo6 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Aditya");

        Optional<String> result = name.filter(x -> x.length()>10);
        System.out.println(result.orElse("Empty"));

        name.map( x-> x.length())
            .filter(len -> len> 10)
            .ifPresent(System.out::println);
    }

    private static Optional<User> getUser(){
        Address a = new Address();
        a.city = "Delhi";

        User u = new User();
        u.address = Optional.of(a);

        return Optional.of(u);
    }
    
}
class User{
    public Optional<Address> address;
}

class Address{
    public String city;
}