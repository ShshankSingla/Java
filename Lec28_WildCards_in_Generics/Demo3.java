import java.util.List;
import java.util.ArrayList;

// wildcard with upper bound (extends ...)
public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal() );
        animals.add(new Animal());

        fun(animals);

    }

    //now incoming list is atleast animal or its subtype
    static void fun(List<?  extends Animal>  values){
        for(Animal a : values){
            a.eat();
        }
    }
}

class Animal{
    void eat(){
        System.out.println("eating");
    }

    void walk(){
        System.out.println("walking");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void walk(){
        System.out.println("Dog is walking");
    }

    void bark(){
        System.out.println("barking");
    }
}
