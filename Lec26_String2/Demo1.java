public class Demo1 {
    public static void main(String[] args) {
        String s = new String("Hello");
        System.out.println(s);

        String s1 = new String(s);
        System.out.println(s1);

        // char array
        char[] array = {'A','d','i','t','y','a',' ','T','a','n','d','o','n'};
        String s5 = new String(array);
        // arr[0] = 'B';

        // System.out.println(s5); //  stirng is immutable

        // char array subset
        String s6 = new String(array, 0, 6);
        System.out.println(s6);

        byte[] arr2 = {97,98,99};
        String s7 = new String(arr2);
        System.out.println(s7);

        String s8 = new String(arr2 , 0,1);
        System.out.println(s8);

        // StringBuilder and StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        String s9 = new String(sb);
        System.out.println(s9);

        StringBuffer sb1 = new StringBuffer("World");
        String s10 = new String(sb1);
        System.out.println(s10);

    }
}
