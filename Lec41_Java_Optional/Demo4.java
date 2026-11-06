import java.util.Optional;
// map
public class Demo4 {
    public static void main(String[] args) {
        // User user = getUser();

        // if(user != null){
        //     Address address = user.address;
        //     if(address != null){
        //         String city = address.city;
        //         if(city != null){
        //             System.out.println(city);
        //         }
        //     }
        // }

        Optional<User> user = getUser();
        user.map(x -> x.address)
            .map(y -> y.city)
            .ifPresent(System.out:: println);


    }

    // private static User getUser(){
    //     Address a = new Address();
    //     a.city = "Delhi";

    //     User u = new User();
    //     u.address = a;

    //     return u;
    // }

        private static Optional<User> getUser(){
            Address a = new Address();
            a.city = "Delhi";

            User u = new User();
            u.address = a;

            return Optional.of(u);
        }
    
}


class User{
    public Address address;
}

class Address{
    public String city;
}