import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Collection <Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // 1. size()
        System.out.println(c.size());

        // 2. isEmpty
        System.out.println(c.isEmpty());

        // 3. boolean contains(Object o)
        System.out.println(c.contains(2));

        // 4. iterate() -> Iterator
        Iterator<Integer> it = c.iterator();

        //5. Object toArray();
        //Collection<Integer> c1 = new LinkedList<>();
        Object[] obj = c.toArray();
        for(Object o: obj){
            System.out.println(o);
        }

        // 6. T[] toArray(T[] a);
        // Integer[] arr2 = new Integer[0];
        // Integer[] arr = c.toArray(arr2);
        Integer[] arr = c.toArray(new Integer[0]); // just to tell what type of output we need
        for(Integer i: arr){
            System.out.println(i);
        }

        // 7. boolean add(E e); generic input
        boolean b = c.add(4);
        System.out.println(b);

        Collection <Integer> c1 = new HashSet<>();
        boolean b1 = c1.add(1);
        System.out.println(b1);
        b1 = c1.add(1);
        System.out.println(b1); // duplicate value

        // 8. boolean remove(Object o)
        System.out.println(c1.remove(1));
        System.out.println(c1.remove(4));

        //9. boolean addAll(Collection <? extends E> c)
        c.addAll(List.of(5,6,7,8,9));
        System.out.println(c);

        //10. contains all 
        // boolean containsAll(Collection<?> c)
        System.out.println(c.containsAll(List.of(1,2,3)));

        // 11. boolean removeAll(Collection<?>c)
        System.out.println(c.removeAll(List.of(8,9)));
        System.out.println(c);

        // 12. boolean retainAll(COllection<?>c); -> intersection
        System.out.println(c.retainAll(List.of(1,2,3))); // -> intersection of passed list and c
        System.out.println(c);

        // 13. clear()
        c.clear();
        System.out.println(c);



    }
}
