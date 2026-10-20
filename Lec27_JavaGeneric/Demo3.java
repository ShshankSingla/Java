//generics
public class Demo3 {
    public static void main(String[] args) {
        // Box b1 = new Box(10); // warning - >not error , treated as obj class initially

        Box<Integer> b1 = new Box<Integer>(10); // type argument
        System.out.println(b1.getValue());

        Box<String> b2 = new Box<String>("Hello");
        System.out.println(b2.getValue());

        System.out.println(b1.getValue()+5);
    }
}

// universal object class from prev lec
// class Box{
//     private Object value;

//     Box(Object value){
//         this.value = value;
//     }

//     public Object getValue() {
//         return value;
//     }

//     public void setValue(Object value) {
//         this.value = value;
//     }
// }

// generics - soln
class Box<T>{ // type parameter
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

