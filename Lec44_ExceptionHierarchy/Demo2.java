public class Demo2 {
    // outer catch will handle inner exception
    public static void main(String[] args) {
        try {
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5/0);
                System.out.println("Inner try ends");
            }
            catch(NullPointerException e){
                System.out.println("Inner Catch starts");
                System.out.println(e);
                System.out.println("Inner catch ends");
            }
            System.out.println("Outer try ends");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Outer Catch Starts");
            System.out.println(e);
            System.out.println("Outer Catch ends");
        }
    }
}
