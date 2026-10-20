public class Demo {
    public static void main(String[] args) {
        // upcasting
        Dog d = new Dog(); // small like int
        Animal a = d; // big like float

        String s = "Hello";
        Object obj = s;
        System.out.println(obj); // internally call toString();

        // downcasting
        Object obj2 = "Aditya";
        String s2 = (String)obj2; // 
        System.out.println(s2);

        // compile time error
        // int x = "String";

        // runtime time error
        // Object obj3 = 10; // autoboxing: primitive-> non primitive
        // String s3 = (String)obj3;
        // System.out.println(s3); // ClassCastException

    }
}

class Animal {
    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("barking");
    }
}
