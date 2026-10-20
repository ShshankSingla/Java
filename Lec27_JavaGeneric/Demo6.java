public class Demo6 {
    public static void main(String[] args) {
        // extend Number class internally
        // Integer x = 4;
        // Double d = 1224d;
        // Float f = 12.2f;

        Box<Integer> b1 = new Box<>();

        // Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Box<T>
        // Box<String> b1 = new Box<>();



    }
}

// class Box<T>{
//     T value;

//     public void printDouble(){
//         //System.out.println(value.doubleValue()); // The method doubleValue() is undefined for the type T

//     }
// }

// Bounds in Generics
// Upper Bound

class Box <T extends Number>{
    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }
}
