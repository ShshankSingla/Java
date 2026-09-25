import org.openjdk.jol.info.ClassLayout;

class Student {
    int age;
    boolean passed;
}

public class JavaObjectLayout {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(
            ClassLayout.parseInstance(student).toPrintable()
        );
    }
}