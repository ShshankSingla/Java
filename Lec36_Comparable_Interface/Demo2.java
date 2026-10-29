import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 95);
        Student s2 = new Student("Rohit",95);

        //as compareTo() comparing only marks, it treat both objects as equal;

        // TreeSet and TreeMap internally use compareTo not equals
        TreeSet<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set.size());// -> 1 , internally compare marks find both equals so consider the second value as duplicate and doesn't allow to add the considered duplicate


    }
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        return this.marks- other.marks;
    } 

    /*
    can use this to resolve the issue of duplicates
    if(this.marks != other.marks){
            return this.marks - other.marks;
        }

        return this.name.compareTo(other.name);
    */
}
