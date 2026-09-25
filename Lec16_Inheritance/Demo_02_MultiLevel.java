public class Demo_02_MultiLevel {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.markAttendance();

        EngineerStudent e = new EngineerStudent();
        e.markAttendance();
        e.attendLab();

        CSEEngineerStudent c = new CSEEngineerStudent();
        c.markAttendance();
        c.attendLab();
    }
    
}

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

class CSEEngineerStudent extends EngineerStudent{

    @Override 
    void attendLab(){
        System.out.println("cse lab attended");
    }
}

