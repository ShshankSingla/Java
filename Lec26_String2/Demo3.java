public class Demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        // 1. append()
        sb.append("Aditya");
        sb.append("Tandon");
        System.out.println(sb);

        // 2. insert();
        sb.insert(6,' ');
        System.out.println(sb);

        // 3. delete()
        sb.delete(6,7);
        System.out.println(sb);
        
        // 4. deleteCharAt()
        sb.deleteCharAt(1);
        System.out.println(sb);

        // 5. replace
        sb.replace(1,4, "XY");
        System.out.println(sb);
 
        // 6. reverse
        sb.reverse();
        System.out.println(sb);

        // 7. charAt
        sb.charAt(5);
        sb.setCharAt(3,'r');

        // 8. length
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("1234567");
        System.out.println(sb.capacity());

        // 9. ensureCapacity
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        // 10.trim
        sb.trimToSize(); // remove the unused buffer
        System.out.println(sb.capacity());



    }
}
