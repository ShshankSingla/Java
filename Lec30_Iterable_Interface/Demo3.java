import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int value = it.next();
            if(value ==3){
                list.remove(value);
            }
            System.out.println(value);
        }


        

    }
}
