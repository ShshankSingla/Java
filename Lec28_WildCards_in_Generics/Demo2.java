import java.util.List;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        //fun(dogs); // dogs ki list animal ki list mei pass nahi kar sakte
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals); // valid
        fun1(animals);
        fun1(dogs);
    }

    static void fun(List<Animal> animals ){
        for(Animal animal : animals){
            animal.eat();
        }
    }

    static void fun1(List<?> values){
        for(Object obj : values){
            // we can only print Object specific methods
            System.out.println(obj.getClass().getName());
        }

        //values.add(new Dog()); // at compile time we doesn't know that our list is of which datatype

        Object obj = values.get(0);
        System.out.println(obj.getClass().getName());
    }
}

class Animal{
    void eat(){
        System.out.println("eating");
    }

    void walk(){
        System.out.println("barking");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
