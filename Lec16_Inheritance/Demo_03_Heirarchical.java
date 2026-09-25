public class Demo_03_Heirarchical {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.markAttendance();

        EngineerStudent e = new EngineerStudent();
        e.markAttendance();
        e.attendLab();

        MedicalStudent m = new MedicalStudent();
        m.markAttendance();
    }
}

class Student {
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineerStudent extends Student {

    @Override
    void markAttendance() {
        System.out.println("Attendance is marked by engineer");
    }

    void attendLab() {
        System.out.println("lab attended");
    }
}

class MedicalStudent extends Student {

    @Override
    void markAttendance() {
        System.out.println("Attendance marked by medical Student");
    }
}