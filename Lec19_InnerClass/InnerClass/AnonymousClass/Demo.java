package AnonymousClass;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.introduce();

        Person p2 = new Guest();
        p2.introduce(); 

        Person p3 = new Person(){
            String name = "Aditya";
            @Override
            void introduce(){
                greet();
                System.out.println("Hi i am a guest by anonymous class");
            }

            void greet(){
                System.out.println("Hello");
            }
        };
        p3.introduce();
    }
    
}


class Person{
    void introduce(){
        System.out.println("Hi i am a person");
    }
}

class Guest extends Person{
    @Override
    void introduce(){
        System.out.println("hi i am a guest");
    }
}