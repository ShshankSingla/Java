import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // invariant in generic
        // Animal animal = new Dog();
        // animal.eat();
        // animal.walk();

        // animal.bark(); // invalid

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animal = dogs; // compile time error

        // Dog[] dogs = new Dog[10];
        // Animal[] animals = dogs;

        // animals[0] = new Dog();
        // animals[1] = new Dog();
        // animals[2] = new Animal(); // runtime error

        // for (Animal a : animals) {
        //     if (a == null)
        //         continue;
        //     a.eat();
        // }
    }
}

class Animal {
    void eat() {
        System.out.println("eating");
    }

    void walk() {
        System.out.println("walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}
