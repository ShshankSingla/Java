public class Demo {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        s = "Hello Ji";
        System.out.println(s);
        String s1 = s.concat(", namastey");
        System.out.println(s);
        System.out.println(s1);

        // literal way to declare Strings
        String a = "Hello";
        String b = "Hello";

        // by string pool both point to same obj
        System.out.println(a==b); // true
        // String class already override .equals() method to compare values only
        System.out.println(a.equals(b)); // true

        // constructor way to declare Strings
        String c = new String("Aditya");
        String d = new String("Aditya");

        // no string pool concept  
        System.out.println(c==d); // false
        // String override this methos
        System.out.println(c.equals(d)); // true
    }
}
