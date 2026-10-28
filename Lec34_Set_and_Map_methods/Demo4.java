import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Rohan");
        map.put(104, "Rehan");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        System.out.println(map.headMap(102));
        System.out.println(map.tailMap(102));

        System.out.println(map.subMap(101,103 ));

        // SortedMap
        System.out.println(map.lowerKey(102));
        System.out.println(map.lowerEntry(102));

        System.out.println(map.floorKey(102));
        System.out.println(map.floorEntry(102));

        System.out.println(map.higherKey(102));
        System.out.println(map.higherEntry(102));

        System.out.println(map.ceilingKey(102));
        System.out.println(map.ceilingEntry(102));

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map.descendingMap());

        System.out.println(map.headMap(102, true));
        System.out.println(map.tailMap(102, false));
        System.out.println(map.subMap(102, true , 103 ,false));

        

    }
    
}
