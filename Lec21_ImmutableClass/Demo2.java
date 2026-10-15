// how to make a class purely immutable
public class Demo2 {
    public static void main(String[] args) {
        College college = new College("IIT G", "Assam");
        Student s1 = new Student(22, "Aditya", college);

        System.out.println(s1.getName());
        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "IIT B";
        System.out.println(s1.getCollege().name);
    }
}

// immutable
// defensive copy of college(non primitive)
final class Student{
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        // defensive constructor
        // deep copy
        this.college = new College(college.name, college.address);
    }
    
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // defensive copy
    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

class College{
    String name ;
    String address;

    College(String name , String address){
        this.name = name;
        this.address = address;
    }
}
