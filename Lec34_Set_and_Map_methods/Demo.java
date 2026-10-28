/*
        Iterable
            |
        Collection
            |
           Set ------------
            |             |
          HashSet       SortedSet
            |             |
        LinkedHashSet  NavigableSet
                          |
                         TreeSet



*/
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        // constructors of HashSet/ LinkedSet
        Set<Integer> set = new HashSet<>(); // initial size of = 16

        // override with initial capacity--> ensure Capacity
        Set<Integer> set2 = new HashSet<>(100);

        //capacity + load factor(by def 0.75)
        Set<Integer> set3 = new HashSet<>(100,0.8f);

        //using another collection
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));

        // all methods are from collection and iterable

    }
}
