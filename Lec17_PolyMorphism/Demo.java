class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Demo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 10));
        System.out.println(c.add(5, 10, 15));
        System.out.println(c.add(5.5, 2.5));
    }
} 