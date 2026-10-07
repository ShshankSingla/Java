package LocalInnerClass;

public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}
// effective final variable
class Outer{

    private int x=4;
    static private int y =5;

    final int a =15;

    //x++; it challenge the effectively final property

    void greet(){
        System.out.println("Hello");

        int z= 5;
        

        class Local{
            void sayHello(){
                System.out.println("Say Hello");
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println(a);
            }

            

        }
        Local local = new Local();
        local.sayHello();
    }
}

// any class inside any code block(constructor, method, if, for, function, static block)
// class linked to some block, scope restrict to local

//what a local class can access
