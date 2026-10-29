import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aditya" ,95));
        list.add(new Student("Rohit" ,85));
        list.add(new Student("Rohan" ,65));

       // Collection.sort(list);// The method sort(List<Student>) is undefined for the type CollectionJava(67108964)
        
       // after comparable interface implementation
        Collections.sort(list);
        for(Student s: list){
            System.out.println(s.name + " , " + s.marks);
        }
        System.out.println(list);

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
        if(this.marks != other.marks){
            return this.marks - other.marks;
        }

        return this.name.compareTo(other.name);
    } 
}
