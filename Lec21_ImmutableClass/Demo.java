public class Demo {
    public static void main(String[] args) {
        // Student s1 = new Student(28, "Aditya");
        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());


        // College college = new College("IIT G", "Assam");
        // System.out.println(college.name);

        // //System.out.println(s1.getCollege);

        College college = new College("IIT G", "Assam");
        Student s1 = new Student(28,"Aditya", college );

        System.out.println(s1.getCollege().name); // "IIT G"
        s1.getCollege().name = "IIT B";
        System.out.println(s1.getCollege().name); // "IIT B"

    }   
}

// (Not purely immutable)
final class Student{
    private final int age;
    private final String name;
    // private final String college;
    private final College college; // this makes my class mutable
    // it creates a reference variable -> and perform shallow copy

    //  one time initialalization as final
    // Student(int age, String name, String college){
    //     this.age = age;
    //     this.name = name;
    //     this.college = college;
    // }

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    // public String getCollege(){
    //     return this.college;
    // }

    public College getCollege(){
        return this.college;
    }
}

// class CSEStudent extends Student{
//  // error: cannot inherit from final Student
// }

// mutable
class College{
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}