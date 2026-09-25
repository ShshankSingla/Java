public class Demo_03 {
    public static void main(String[] args) {
        // the reference variable depends of reference type for such cases
        A a = new B();
        a.fun();
        // private method can't be accessed outside of class
        //a.fun1();
        a.fun2();

        System.out.println(a.x);

        //example of how static, private, final, and instance methods/variables behave with inheritance.
    }
}

// static 
class A{
    int x = 10;

    static void fun(){
        System.out.println("HEllo-static");
    }

    private void fun1(){
        System.out.println("Hello-private");
    }

    final void fun2(){
        System.out.println("Hello-final");
    }
}

class B extends A{
    int x= 20;

    static void fun(){
        System.out.println("Bye");
    }

    private void fun1(){
        System.out.println("Hello-private form child");
    }

    //Cannot override the final method from A
    // final void fun2(){
    //     System.out.println("Hello-final from child");
    // }
}
