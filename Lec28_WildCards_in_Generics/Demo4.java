import java.util.List;
import java.util.ArrayList;

// generics with lower bound (super)
public class Demo4 {
    public static void main(String[] args) {
            List<Animal>animals =  new ArrayList<>();
            animals.add(new Animal());
            animals.add(new Animal());

            fun(animals);
            //fun(objects);
            
        };
    

    public static void fun(List<? super Animal> values ){
        // what is valid - writing
         
        values.add(new Animal());
        values.add(new Dog());
        values.add(new Cat());
        values.add(new Labrador());
        values.add(new Pug());

        // reading is not allowed
        // for(Animal a : values){
        //     //Type mismatch: cannot convert from element type capture#7-of ? super Animal to Animal
        // }

        // only reading valid
        for(Object obj : values){
            Animal a = (Animal)obj;
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


class Cat extends Animal{

}

class Labrador extends Dog{

}

class Pug extends Dog{

}