public class Demo4 {
    public static void main(String[] args) {
        StreetDog s = new StreetDog();
        s.bark();
        s.eat();

        Dog d = new StreetDog();
        d.bark();
        d.eat();

        Animal a = new StreetDog();
        a.eat();
        // a.bark(); invalid

        // Dog d1 = new Dog(); // invalid : Dog is abstract; cannot be instantiated
        // d1.bark();
        // d1.eat();
    }   
}

// interface inheritance
interface Animal{
    void eat();


}

interface Dog extends Animal{

    void bark();
}

class StreetDog implements Dog{

    @Override
    public void eat(){
        System.out.println("Street Dog is eating");
    }

    @Override
    public void bark(){
        System.out.println("Street Dog is barking");
    }
}
