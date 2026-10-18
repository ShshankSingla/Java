public class Demo3 {
    public static void main(String[] args) {
        A a = new C();
        a.fun();
        // a.fun2(); // invalid

        B b = new C();
        // b.fun(); // invalid
        b.fun2();

        C c = new C();
        c.fun();
        c.fun2();
    }
    
}

// multiple inheritance
interface A{
    void fun();
}

interface B{
    void fun2();
}

class C implements A,B{
    @Override
    public void fun(){
        System.out.println("From interface A");
    }

    @Override
    public void fun2(){
        System.out.println("From interface B");
    }
}


