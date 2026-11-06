import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Aditya");
        Optional<String> name1  = Optional.ofNullable(null);

        //1. get value;
        String s = name.get();
        System.out.println(s);
        // String s1 = name1.get();
        // System.out.println(s1); // NoSuchElementException: No value present

        if(name1.isPresent()){
            String s1 = name1.get();
        }else{
            System.out.println("Exception occur: NoSuchElementException: No value present");
        }

        name1.ifPresent(System.out::println);
        System.out.println();
        
        //orElse
        String name2 = name1.orElse("Unknown");
        System.out.println(name2);
    }
}
