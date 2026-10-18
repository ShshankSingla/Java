public class Demo7 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}
// java resolution priority rule

interface A{
 default void fun(){
    System.out.println("Inside A interface");
 }
}

class B{
    public void fun(){
        System.out.println("Inside B class");
    }
}

class C extends B implements A{

}