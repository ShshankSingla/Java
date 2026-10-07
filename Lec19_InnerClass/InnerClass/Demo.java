public class Demo {
    public static void main(String[] args) {

        Outer.Inner inner = new Outer(). new Inner();
        inner.fun();

        inner.fun();

        inner.fun2();
        Outer.Inner.fun2();
        
    }
}

class Outer{
    int x = 20;

    class Inner{
        // local variable got preference
        int x = 10;

        //Outer outer; // in build by preference


        void fun(){
            // valid
            System.out.println("Inner class: " +x);
            System.out.println("Outer class: " + Outer.this.x);

            // also valid // local varuable got preference
            System.out.println("Inner class : "+ x);
            
        }

        static void fun2(){
            System.out.println("Hello");
        }
    }

}

//-> Non static inner class
// 1. Inner class can access any member whether it is static or not-static of outer class

// 2.
// Here is a cleaner and more structured version of your notes:
// Inner Class and Static Members
// Before Java 16:
// - A non-static inner class could not contain static members or static methods.
// - This restriction was relaxed starting from Java 16.
// - So, the statement "Inner classes cannot contain static members" is true only up to Java 15.
// Why was it restricted earlier?
// Consider:
// class A {
//     class B {
//         static int x;
//     }
// }

// Here:
// - A → Outer class
// - B → Non-static inner class
// - x → Static member of B
// Remember:
// static means the member belongs to the class, not to an object.

// So:
// x belongs to class B
//         ↓
// B belongs to an object of A
//         ↓
// Different objects of A can have different B objects

// This created a conceptual problem in older Java versions:
// A a1 = new A();
// A a2 = new A();

// A.B b1 = a1.new B();
// A.B b2 = a2.new B();

// Since B is a non-static inner class, every B object is associated with an instance of A.
// But static x says:
// There should be ONE x
// for the entire class B

// This creates confusion between:
// Object-level relationship
// A object → B object

// and:
// Class-level relationship
// B class → static x

// Important point
// Java eventually relaxed this restriction in Java 16, allowing static members in inner classes.
// So your core idea can be summarized as:
// Earlier Java versions restricted static members in non-static inner classes because an inner-class instance is tied to an outer-class object, while a static member belongs to the inner class itself rather than any particular inner-class instance. Java 16 removed this restriction.