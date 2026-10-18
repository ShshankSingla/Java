public class Demo {
    public static void main(String[] args) {
        Car c = new Thar();
        c.drive();
    }
}

interface Car{
    // default public 
    void drive();
}

class Thar implements Car{

    @Override
    // need to add public as same in parent
    public void drive(){
        System.out.println("Thar is driving");
    }
}

abstract class Maruti implements Car{
    abstract public void drive();
}

class RedMaruti extends Maruti{
    @Override
    public void drive(){
        System.out.println("Red Maruti is driving");
    }
}