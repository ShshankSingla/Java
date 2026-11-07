public class Demo3 {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
