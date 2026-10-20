public class Demo2 {
    public static void main(String[] args) {
        
        String s1 = new String("Aditya");

        // length/emptiness
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        // character access
        System.out.println(s1.charAt(2));
        char[] arr = s1.toCharArray();
        for(char ch : arr){
            System.out.println(ch);
        }

        // comparison
        String s2 = new String("Aditya");
        String s3 = new String("ADITYA");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        //lexicographical comparison  : result -> -ve, 0 , +ve
        System.out.println(s1.compareTo(s3));

        // searching
        System.out.println(s1.contains("di"));
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.lastIndexOf("di"));
        System.out.println(s1.startsWith("Ad"));
        System.out.println(s1.endsWith("tya"));

        // extraction/transformation
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s4 = new String("  White Tower  ");
        System.out.println(s4.length());
        System.out.println(s4.trim());
        String s5 = s4.trim();
        System.out.println(s5.length());

        String s6 = new String("  Adit  ya  ");
        System.out.println(s6.strip());// unicode friendly
        String str = "\u2003Hello\u2003";

        System.out.println(str.trim().length());
        System.out.println(str.strip().length());

        System.out.println(s1.repeat(3));
        System.out.println(s1.replace("di", "bi"));

        String s7 = new String("abc abc abc");
        System.out.println(s7.replaceAll("a", "d"));

        String[] brr = s7.split("a");
        for(String s: brr){
            System.out.println(s);
        }

        System.out.println(String.join("-", "a","b","c"));

        // Conversion
        String s8 = new String(String.valueOf(10));
        System.out.println(s8);

        // string to bytearray
        byte[] crr = s1.getBytes();
        for(byte i: crr){
            System.out.print(i + ", ");
        }
        System.out.println();

        // advance method -> intern , format
        String s9 = new String("Hello");
        String s10 = s9;
        String s11 = s9.intern(); // s11 now point Hello in string pool

        System.out.println(s9==s10);
        System.out.println(s9==s11); // s11 point to hello in string pool

        // format
        String name = "Aditya";
        int age = 28;
        System.out.println("Hello" + " "+name+", your age is "+ age);
        System.out.println(String.format("Hello %s, your age is %s", name, age));


    }
}
