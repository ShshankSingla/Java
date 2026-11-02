// types of method reference


import java.util.*;
import java.util.function.*;
public class Demo4 {

    // method reference can take only inbuild functions

    // 1. static method referene
    /*
    x -> Math.abs(x)
    Math::abs
     */

    // 2. instance method reference
    /*
    x -> sout(x);
    System.out::println  we are refering through out and out is an obj
    */

    // 3. Predicate method reference
    /*
    str -> str.isEmpty()
    String::isEmpty

    e.g. Predicate <String> p = String::isEmpty()
    p.test("Hello") -> it return false
     */

    // 4. Constructor reference
    /*
    lambda expression for Supplier
    Supplier<R> s: ()-> new ArrayList<Integer>();
    List<Integer> list = s.get(); provide an arrayList obj


    s = ArrayList::new // as we are calling constructor
     */
    
}


