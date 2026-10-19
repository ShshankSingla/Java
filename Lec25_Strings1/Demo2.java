public class Demo2 {
    public static void main(String[] args){
        String s1 = "Ja" + "va";
        String s2 = "Java";
        System.out.println(s1== s2);
        
        String s3 = "Ja";
        String s4 = s3 + "va";
        // s2 is formed during compile time-> string pool
        // s4 is formed during run time  -> normal heap
        System.out.println(s2== s4); //false

        String s5 = "Hello";
        String s6 = s5;
        //normal assignments resolve at compile time
        System.out.println(s5 == s6);

    }
}


