public class Final {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.PI);

        final int x;
        x=4;
        System.out.println(x);
    }

}
class Random{
    // valid 
    //final double PI = 3.14;
    final double PI;
    Random(){
        this.PI = 3.14;
    }
    
   
}