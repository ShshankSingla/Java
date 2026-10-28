import java.util.*;
// map writes all its methods on its own, not getted from collection interface
    //     Map-------------
    //      |             |
    //   HashMap       SortedMap
    //      |             |
    // LinkedHashMap   NavigableMap
    //                    |
    //                 TreeMap
import java.util.Map.Entry;


// HashTable
// Properties
// EnumMap
// IdentityMap
// Concurrent HashMap
// Weak HashMap
public class Demo2 {
    public static void main(String[] args) {
        // Maps
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.containsKey(null)); //false
        System.out.println(map.containsValue(null)); // false
        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Rohan");

        // 1. map.size
        System.out.println(map.size());

        // 2. map.isEmpty
        System.out.println(map.isEmpty());

        // 3. containsKey
        System.out.println(map.containsKey(102));
        System.out.println(map.containsKey(null));

        //4. containsValue
        System.out.println(map.containsValue("Rohit"));

        // 5. .get()
        System.out.println(map.get(102));
        System.out.println(map.get(105)); // null

        // 6.
        // when enter an new key it return the value present in that col which is by def null(older value)
        // (104,"Abhay") --> [null | null]
        System.out.println(map.put(104,"Abhay"));

        // entering an existing key
        // (104, "Rajat") --> [104 | "Abhay"]  
        // it return the older value " Abhay"
        System.out.println(map.put(104,"Rajat"));

        // 7. remove
        System.out.println(map.remove(104));

        // 8. putAll
        Map<Integer , String> map2 = new HashMap<>();
        map2.put(104,"Ajay");
        map2.put(105, "Abhinav");


        map.putAll(map2);
        System.out.println(map);

        //9. clear()
        map2.clear();
        System.out.println(map2);

        // Important
        // 10. keySet()  - return set of keys
        Set<Integer>st = map.keySet(); // keys are not duplicate, that's why set
        System.out.println(st);

        Collection<String> c = map.values();
        System.out.println(c);

        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        System.out.println(entry);

        System.out.println(map.get(102));
        System.out.println(map.get(106));
        // avoid null pointer exception
        System.out.println(map.getOrDefault(106, "Not added yet"));

        // put if not present , but doesn't replace
        System.out.println(map.putIfAbsent(106, "Ranjan"));
        System.out.println(map);

        System.out.println(map.remove(101,"Rohit")); // no such pair exist

        System.out.println(map.replace(101, "Sonu")); // if key exist, then replace but never create a new key if not exist

        System.out.println(map.replace(101, "Sonu", "Aditya")); // replace if old value is "Sonu" otherwise not

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> e: entries){
            Integer key = e.getKey();
            String value = e.getValue();

            System.out.println(key + " "+ value);
        }

        // immutable map
        Map<Integer, String> map3 = Map.of(101,"A", 102, "B");
        System.out.println(map3);
        
        
    }
}
