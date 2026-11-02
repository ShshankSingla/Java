import java.util.*;
import java.util.function.*;
// method reference
// optimize lambda expression
public class Demo3 {
    public static void main(String[] args) {
        // Consumer c = (x) -> sout(x); // here we define the logic, nto function call
        //list.forEach(c.accept(7)); 

        // method resolution operator
        // System.out::println  , java take it as a logic, we are not calling println, take take it when he needed it
        // className.ObjName::functionName

        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        // 1.
        list.forEach(new Consume());

        //2. 
        list.forEach(x -> System.out.println(x));

        // 3.  when to use -> when using inbuilt funtion
        list.forEach(System.out::println);

    }
}

//1.
class Consume implements Consumer<Integer>{
    @Override
    public  void accept(Integer x){
        System.out.println(x);
    }
}
 