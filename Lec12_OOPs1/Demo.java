public class Demo{
    public static void main(String[] args) {
        Student s1 = new Student();

        // Student s1 = new Student("Rahul", 56, "23BCS13225", "CU");
        s1.print();
    }
}

class Student {
    String name;
    int age;
    String rollNo;
    String college;

    Student(){

    }

    Student(String name, int age, String rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        //this.college = college;
    }

    Student(String name, int age, String rollNo, String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }

    void markAttendance(){
        System.out.println("can mark attendance");
    }

    void print(){
        System.out.println(this.age +" "+ this.name + " "+ this.college + " " + this.rollNo);
    }
}

