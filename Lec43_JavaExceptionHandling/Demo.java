public class Demo {
    public static void main(String[] args) {
        int x =5;
        try{
           x=x/0 ;
        }catch(Exception e){
            System.out.println("hi " + e);
        }
    }
}
