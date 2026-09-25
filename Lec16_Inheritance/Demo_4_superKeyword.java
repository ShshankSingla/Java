public class Demo_4_superKeyword {
    public static void main(String[] args) {
        // EngineeringStudent e = new EngineeringStudent();
        // e.name = "Shshank";
        // e.age = 22;
        // e.rollNo = 4;
        // e.college = "CU";
        // e.print();

        EngineeringStudent e = new EngineeringStudent("CU");
        e.print();
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    int x = 4;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo; 
    }

    void print(){
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("rollNo "+  rollNo);
    }
}

class EngineeringStudent extends Student{
    String college;
    int x = 5;

    EngineeringStudent(String college){
        super("Shshank", 22, 4);
        this.college = college;
    }

    // accessing varibale from parent class
    // void print(){
    //     System.out.println(super.age + " , "+ super.name+ " , "+ rollNo);
    //     System.out.println("Parent class variable: "+super.x);
    //     System.out.println("Current class variable: "+x);
    // }

    // accessing method from parent class
    void print(){
        super.print();
        System.out.println("college "+college);
    }

}
