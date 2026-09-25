public class Demo_01_Simple {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.markAttendance();
        EngineerStudent e = new EngineerStudent();
        e.markAttendance();
        e.attendLab();
    }
}

// simple inheritance
class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineerStudent extends Student{
    // no need of markAttendance function

    // lets override
    @Override
    void markAttendance(){
        System.out.println("Attendance is marked by engineer");
    }

    void attendLab(){
        System.out.println("lab attended");
    }
}