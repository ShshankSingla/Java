// treeset
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        // TreeSet -> BST

        // empty constructor
        TreeSet<Integer> set = new TreeSet<>();

        // NavigableSet<Integer> set = new TreeSet<>();
        // SortedSet<Integer> set = new TreeSet<>();


        // from another collection
        TreeSet<Integer> set2 = new TreeSet<>(List.of(2,5,7,9));
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);

        // SortedSet Interface -> O(log N)
        //1. smallest value
        System.out.println(set.first());

        //2. largest value
        System.out.println(set.last());

        //3. headset -> provide strictly less than range of elements
        System.out.println(set.headSet(80));

        //4. tailset -> current element included
        System.out.println(set.tailSet(80));

        // 5. subset, from is inclusive and to is exclusive
        System.out.println(set.subSet(23,80 ));

        // Navigable Set Interface 

        //1. largest number closer to curr ele but smaller as compare to this
        // chota number
        System.out.println(set.lower(80));

        //2. floor -> chota ya barabar
        System.out.println(set.floor(80));

        //3. higher -> kewal bda number
        System.out.println(set.higher(80));

        //4. ceiling -> bda ya barabar
        System.out.println(set.ceiling(80));

        // 5. pollfirst, pollLast  -> number return to karenge par unhe set se nikal bhi denge
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());

        System.out.println(set);

        // 6. first , last
        System.out.println(set.first());
        System.out.println(set.last());

        //7. descendingSet
        System.out.println(set.descendingSet());

        //8. descendingIterator
        Iterator<Integer> it = set.descendingIterator();
        
        System.out.println("original: "+set);
        while(it.hasNext()){
            System.out.printf("%d, ",it.next());
        }
        System.out.println();

        //9. headSet -> override, in this we can tell whether we want to include current ele or not
        System.out.println(set.headSet(80,true));

        //10. tailset -> override , in this we can tell whether we want to include the current ele or not
        System.out.println(set.tailSet(80, true));

        // 11. subset -> override
        System.out.println(set.subSet(23,false, 50,true));

        //12. 
        
    }
}
