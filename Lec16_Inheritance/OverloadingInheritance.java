public class OverloadingInheritance {
    public static void main(String[] args) {

        EngineeringStudent e = new EngineeringStudent();

        e.study();
        e.study(3);
        e.study("Java");
    }
}

class Student {

    void study() {
        System.out.println("Student is studying");
    }

    void study(int hours) {
        System.out.println("Student studied for " + hours + " hours");
    }
}

class EngineeringStudent extends Student {

    // Overloading inherited method
    void study(String subject) {
        System.out.println("Engineering student is studying " + subject);
    }
}