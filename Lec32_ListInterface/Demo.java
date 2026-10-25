import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAll(List.of(4,5,6));

        for(Integer i: list){
            System.out.printf("%d, ",i);
        }
        System.out.println();

        System.out.println(list);

        int size = list.size();
        for(int i=0;i<size;i++){
            System.out.printf("%d, ",list.get(i));
        }
        System.out.println();


        System.out.println("LinkedList");
        List<Integer> list1 = new LinkedList<>();
        list1.addAll(List.of(1,2,3,4,5,6));
        System.out.println(list1.get(2));
    }
}
