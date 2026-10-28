import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // hashmap/ linked hashmap

        Map<Integer, String > map = new HashMap<>();

        Map<Integer, String> map2 = new HashMap<>(100);

        Map<Integer, String> map3 = new HashMap<>(100, 0.8f);

        Map<Integer, String> map4 = new HashMap<>(Map.of(101, "Abhay", 102, "Aditya"));

        Map<Integer, String> map5 = new HashMap<>(map);
    }
}
