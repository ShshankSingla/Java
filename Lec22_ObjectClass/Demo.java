import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Aditya", 22);

        // 1. checking toString()
        // after overide
        System.out.println(s1.toString());
        System.out.println(s1);

        // 2. checking equals()
        Student s2 = s1;
        Student s3 = new Student("Aditya", 22);

        if(s1.equals(s2)){
            System.out.println( " s1 and s2 are equals as they share the same object means refer to same object in heap memory");
        }

        if(s1.equals(s3)){
            System.out.println("nothing");
        }
        else{
            System.out.println("deep copy, both refer to different objects in heap memory");
        }

        // after override // comparing values not references
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Student s4 = null;
        System.out.println(s1.equals(s4));
        Integer i = 4;
        System.out.println(s1.equals(i));
        System.out.println(s1.equals(s1));
        System.out.println();

        // 3. hashcode
        // rule : if obj are equals then their hash will also be equal and vice versa may not be true
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println(s1.equals(s3)); // it is giving true becasue we override the equals()
        System.out.println(s1.hashCode() == s3.hashCode()); // without override false , with override true

        // after override as s1 as s2 both contain same value so we are going to make their hashcode equals

        // 4. getClass()
        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());
        System.out.println();

        // 5. instanceOf()
        System.out.println("instanceof");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Object);

        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName());
        System.out.println(d.getClass().getName());

        System.out.println(a instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(d instanceof Dog);

        // 5. clone()
        Student s5 = (Student)s1.clone();
        System.out.println(s5.name);
        System.out.println(s5.age);

    }
}

class Student extends Object implements Cloneable{
    String name;
    int age;

    @Override
    public String toString(){
        return (name + " , " + age);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        // to avoid null pointer exception
        if(obj == null){
            return false;
        }

        // to avoid class caste exception
        if(obj.getClass() != this.getClass()){
            return false;
        }

        // type cast
        Student s = (Student)obj;

        // now it is comparing the values not the refrences
        return (this.name == s.name  && this.age == s.age);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + age;
        result = result * 31 + ((name == null) ? 0 : name.hashCode());

        return result;

        // return Objects.hash(name, age); // same implementation
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Animal{

}

class Dog extends Animal{

}
