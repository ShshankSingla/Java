import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aditya",101,85));
        list.add(new Student("Rohit",102,89));
        list.add(new Student("Rohan",103,93));
        list.add(new Student("Sonu",104,98));

        
        //3 anonymous class 
        // Collections.sort(list, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student s1, Student s2){
        //         return s1.marks - s2.marks;
        //     }
        // });

        // for(Student s : list){
        //     System.out.println(s.name+", "+s.rollNo+", "+s.marks);
        // }

        Collections.sort(list, (s1,s2)->( s1.marks - s2.marks));

        for(Student s : list){
            System.out.println(s.name+", "+s.rollNo+", "+s.marks);
        }

    }
}

class Student {
    

    String name;
    int rollNo;
    int marks;

    public Student( String name, int rollNo, int marks) {

    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
    }
    
}


// class SortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.name.compareTo(s2.name);
//     } 
// }

// class SortByRollNo implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.rollNo - (s2.rollNo);
//     } 
// }

// class SortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.marks - (s2.marks);
//     } 
// }