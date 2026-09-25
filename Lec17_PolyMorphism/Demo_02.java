class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Demo_02 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}