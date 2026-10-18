public class Demo2 {
    public static void main(String []args){
        Random r1 = new Random();
        r1.fun();

        MathConstants r2 = new Random();
        r2.fun();
    }
}


//variables inside interfaces

interface MathConstants{
    // public static final
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void fun();
}


class Random implements MathConstants{
    public void fun(){
        System.out.println(PI_VALUE);
    }
}