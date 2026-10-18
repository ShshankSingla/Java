public class Demo5 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        Vehicle.brake();
    }
}

// after java8

//1. default methods
interface Vehicle{
    default void drive(){
        System.out.println("Vehicle is driving ");
        // can call private methods only inside the interface
        accelerate();
    }

    static void brake(){
        System.out.println("Vehicle is applying brake");
    }

    private void accelerate(){
        System.out.println("vehicle is accelerating");
    }
}

class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Car is driving");
    }
}