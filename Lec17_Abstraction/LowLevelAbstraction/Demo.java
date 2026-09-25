public class Demo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.brake();
    }
}


class Car{
    String type;
    void start(){
        System.out.println("the car is start now");
    }

    void accelerate(){
        System.out.println("the car is accelerating");
    }

    void brake(){
        System.out.println("the car is stoping");
    }
}