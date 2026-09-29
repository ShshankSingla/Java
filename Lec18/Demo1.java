public class Demo1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();

        Animal b = new Dog("Bruno");
        System.out.println(b.name);

        // static 
        System.out.println(Animal.type);
        Animal.eat();
    }
}

abstract class Animal{
    String name;

    static String type;

    // can have constructors
    Animal(String name){
        this.name = name;
    }

    // abstarct method
    abstract void makeSound();

    // concrete method
    void sleep(){
        System.out.println("Sleeping");
    }

    static void eat(){
        System.out.println("Animal is eating");
    }



    // final methods can't be abstract
    final void run(){
        System.out.println("Animal is running");
    }



    // private abstract void walk() --> not allowed

    static{
        Animal.type = "Mammal";
        System.out.println("static block executed");
    }
}

class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("bark");
    }
}


// Abstract classes
//1. Cannot be instantiated directly
//2. Can contain abstract method (method without implementations)
//3. Can also contain normal methods.
//4. Is meant to be extended.

// Questions:
//1. Can abstract classes have constructors? --> Yes
//2. Can abstract classes be final? --> No
//3. Can abstract class have static methods/variables? --> Yes
//4. Can abstract classes private methods? --> Yes but non abstract
//5. Can abstract classes have final method? --> Yes but non abstract
//6. Can abstract classes have no abstract method? --> Yes
