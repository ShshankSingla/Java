public class Demo_01 {
    public static void main(String[] args) {
        // abstract class ka object nahi bna sakte
        
        Car c = new FuelCar();
        c.accelerate();
    }
}

abstract class Car{
    void start(){
        System.out.println("car started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car{

    @Override 
    void accelerate(){
        System.out.println("FuelCar is accelerating");
    }

    @Override 
    void brake(){
        System.out.println("FuelCar is stopping");

    }
}

class ElectricCar extends Car{
    @Override 
    void accelerate(){
        System.out.println("ElectricCar is accelerating");

    }

    @Override 
    void brake(){
        System.out.println("ElectricCar is stopping");

    }
}
