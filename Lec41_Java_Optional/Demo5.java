import java.util.Optional;

public class Demo5 {
    public static void main(String[] args) {
        // Optional<User> user = getUser();
        


        Optional<User> user = getUser();
        //Optional<Optional<Address>> address = user.map(x -> x.address);

        user.flatMap(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out:: println);

        
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