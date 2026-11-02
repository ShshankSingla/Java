import java.util.function.*;
// functional composition
// break a larger function into meaningful parts
// int result = ((x+2)*5);
// f(x) = x+2;
// g(x) = x*5
// g(f(x))
public class Demo5 {

    public static void main(String[] args) {
        // Functional Interface
    // Funciton<T,R>  -> R apply(T t);
    // methods  1. andThen(),,   2. compose()

    Function<Integer, Integer> equation = x-> ((x+2)*3);
    System.out.println(equation.apply(2));

    Function<Integer, Integer> add2 = x-> (x+2);
    Function<Integer, Integer> mul3 = x-> x*3;
    Function<Integer, Integer> div2 = x-> x/2;

 
    int a = add2.apply(2);
    System.out.println(a);
    int b = mul3.apply(a);
    System.out.println(b);

    int ans = mul3.apply(add2.apply(2));
    System.out.println(ans);

    // take a function in input and output a function
    int ans2 = add2.andThen(mul3).andThen(div2).apply(2);  //left to right
    System.out.println(ans2);
        // f.andThen(g) = g(f(x)) = g.apply(f.apply());


    // compose
    // F.compose(G) = F(g(x))  = right to left = g perform first 

    // both these functions can work on method reference
    //Function<String, String> toUpper = str -> str.toUpperCase();
    // Function<String, Integer> length = str -> str.length;
//
    //with method reference
    //Function<String, String> toUpper = String::toUpperCase;
    // Function<String, Integer> length = String::length;

    }
    
}
