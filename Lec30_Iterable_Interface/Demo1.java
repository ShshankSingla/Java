import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// there are two separate interfaces -> iterable, iterator
public class Demo1 {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(3);
        // list.add(5);
        // System.out.println(list.size());

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // } 

        // for(int i: list){
        //     System.out.println(i);
        // }

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int i: list){
            System.out.println(i);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collection<Integer> c = new ArrayDeque<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);

        Iterator<Integer> i = c.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
