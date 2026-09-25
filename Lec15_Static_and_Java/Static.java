public class Static{
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 28 ,101);
        Student s2 = new Student("Rohit", 28,102);

        Student.college = "IIT Guwahati"; // highest preference  
        // not industry oriented but valid
        System.out.println(s1.college + " " + s2.college);

        // highest preference  
        System.out.println(Student.college);
    }
}

class Student{
    String name ;
    int age;
    int rollNo;
    static String college = "IIT BHU";  // least preference

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        
    }

    // industry based 
    static {
        college = "IIT Madras" ; // moderate preference
    }
}