import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(1));

        list.set(1, 10);
        System.out.println(list);

        list.add(1,20);
        System.out.println(list);

        list.addAll(1, List.of(9,8,7));
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.indexOf(20));

        System.out.println(list.lastIndexOf(5));
        System.out.println(list.lastIndexOf(10));

        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            System.out.printf("%d, ", it.next());
        }

        System.out.println();
        ListIterator <Integer> it1 = list.listIterator(5);
        while(it1.hasPrevious()){
            System.out.printf("%d, ", it1.previous());
        }

        System.out.println();
        ListIterator <Integer> it2 = list.listIterator(6);
        while(it2.hasPrevious()){
            System.out.printf("%d, ", it2.previous());
        }
        System.out.println();

        // immutable list
        List<Integer> l = List.of(1,2,3);
        System.out.println(l);
        // l.add(2); // UnsupportedOperationException
        // System.out.println(l); // ImmutableCollections

        List<Integer> l2 = List.copyOf(l);
        System.out.println(l2); // also immutable
        
    }
}
