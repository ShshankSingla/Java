public class StaticNestedClass_01{
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.fun();

        //1. to access non static inside static class
        Outer outer = new Outer();
        inner.fun1(outer);

        //2. to access non static inside static class using constructor
        Outer.Inner1 inner1 = new Outer.Inner1(outer);
        inner1.fun();
    }
}

class Outer{
    int x =4;

    static int y = 5;

    // as static means we related to class
    static class Inner{

        void fun(){
            System.out.println("we are inside inner class");
            // System.out.println(x); // can't access as static can't access non static
            System.out.println(y);
        }

        void fun1(Outer outer){
            System.out.println("now can access non static things");
            System.out.println(outer.x);
            System.out.println(y);
        }
    }

    static class Inner1{
        Outer outer;

        Inner1(Outer outer){
            this.outer = outer;
        }

        void fun(){
            System.out.println("Inside inner1 class and access using constructor");
            System.out.println(outer.x);
            System.out.println(y);
        }
    }
}

class BankAccount{

    private static class InterestCalculator{
        static double calculateYearly(double principal, double rate){
            return principal * rate;
        }
    }
    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal, 0.09);
    }
}