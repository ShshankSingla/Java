public class Demo6 {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
        d.fun1();
    }
}


// interface A{
//     void fun();
// }

// interface B extends A{

// }

// interface C extends A{

// }

// class D implements B,C{
//     @Override
//     public void fun(){
//         System.out.println("Default implementation");
//     }
// }

interface A{
    void fun();

    void fun1();
}

interface B extends A{
    default void fun(){
        System.out.println("B");
    }

    default void fun1(){
        System.out.println("B");
    }
}

interface C extends A{
    default void fun(){
        System.out.println("C");
    }

    default void fun1(){
        System.out.println("C");
    }
}


class D implements B,C{
    @Override
    public void fun(){
        System.out.println("Default implementation of D");
    }

    @Override
    public void fun1(){
        B.super.fun1();
    }
}