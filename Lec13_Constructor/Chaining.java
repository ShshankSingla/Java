class Student{
    String name ;
    int age;
    int rollNo;
    String college;

    Student(){
        this("Unknown");
        System.out.println("I am the first Constructor");
    }

    Student(String name){
        this(name, 0);
        System.out.println("I am the second Constructor");
    }

    Student(String name, int age){
        this(name, age,0);
        System.out.println("I am the third Constructor");
    }

    Student(String name, int age, int roll){
        this(name, age,roll,"Unknown" );
        System.out.println("I am the fourth Constructor");
    }

    Student(String name, int age, int roll, String college){
        this.name = name;
        this.age = age;
        this.rollNo = roll;
        this.college = college;
        System.out.println("I am the fifth Constructor");
    }

}

public class Chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
