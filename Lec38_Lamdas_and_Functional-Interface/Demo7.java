import java.util.function.*;

public class Demo7 {
    public static void main(String[] args) {
        Predicate<Student> passed = s -> s.marks >=40;
        Predicate<Student> isAdult = s -> s.age >= 18;

        Predicate<Student> isEligible = passed.and(isAdult);
        System.out.println(isEligible.test(new Student(50, 17)));
    }
}

class Student{
    int marks;
    int age;

    public Student(int marks, int age){
        this.marks = marks;
        this.age = age;
    }
}
