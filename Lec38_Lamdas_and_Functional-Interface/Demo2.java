import java.util.function.*;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
       // input type and output type 
        Function<Integer, Integer> square = x -> x*x;
        //System.out.println(square.apply(5));
        //-> unboxing -> operation -> autoboxing

        Consumer<Integer> print = x-> System.out.println(x);
        //print.accept(7);

        Supplier<Double> randomValue = ()-> Math.random();
        //System.out.println(randomValue.get()*100 );

        Predicate<Integer> isEven = x -> x%2==0;
        //System.out.println(isEven.test(4));

        List<Integer>list  = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));

        // for(Integer it: list){
        //     System.out.printf("%d",it);
        // }
        // System.out.println();

        list.forEach(x-> System.out.println(x)); // for each take Consumer obj -action

        // to make process faster 
       // primitive functional interfaces
       // int , long, double
       
       //IntFunction<T>  int-> R, R is object  , same for long, double
       //  ToIntFunction<T>  T-> int, T is input object, same for long, double


      // primitive Consumer family   T-> void
      // IntConsumer   int -> void
       // ObjIntConsumer   (T,int) -> void

       // primitive supplier family   void -> R
   //     IntSupplier(void -> int)


        // primitive predicate family  T-> boolean
        // IntPredicate  (int -> boolean)

        // primitive operator family    e.g.  (int -> int)
        //  IntUnaryOperator (int -> int), LongUnaryOperator (long -> long), DoubleUnaryOperator(double -> double)
        // IntBinaryOperator (int , int)-> int, LongBinaryOperator (long , long)-> long ,DoubleBinaryOperator (double , double)-> double
    }
} 
