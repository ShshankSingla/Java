import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        int count=0;
       // to get out of memory error
        while(true){
            list.add( new int[250000]); // 1MB
            count++;
            System.out.println("Allocated Block: "+ count);
        }
    }
}

 /*
javac Demo.java

java -Xms2m -Xmx4m Demo
// */
