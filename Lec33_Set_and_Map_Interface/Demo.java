import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("Aditya");
        st.add("Rohit");
        st.add("Rohan");

        System.out.println(st.contains("Aditya"));
        System.out.println(st.contains("Abhay"));

        Map<Integer, String> mp = new HashMap<>();
        mp.put(101, "Aditya");
        mp.put(102, "Rohit");
        mp.put(103, "Aditya");

        System.out.println(mp.containsKey(101));
        System.out.println(mp.get(101));


    }
}
