public class Demo{
    public static void main(String[] args) {
        Integer x = 200;
        Integer y = 200;

        System.out.println(x==y);

        // The range of -128 to +127 is already mapped ,
        // means objects corresponding to these values are already created , 
        // so only reference is copied to x and y
        x= 100;
        y = 100;

        System.out.println(x==y);

        x=300;
        y = 300;

        System.out.println(x==y);


    }
}