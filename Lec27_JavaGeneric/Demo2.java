public class Demo2 {
    public static void main(String[] args) {
        // Box b1 = new Box(10);
        // System.out.println(b1.getValue());

        // invalid
        // Box b2 = new Box("Hello"); // make an another class 

        // we make a generic class
        // here upcasting is happening
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());

        // here down casting is happening
        System.out.println((int)b1.getValue()+5);

        System.out.println((Integer)b1.getValue() + 5);

        Integer x= (Integer)b1.getValue();
        String s = (String)b2.getValue();

        System.out.println(x +" , "+ s);
        System.out.println(x+5);


    }
}



// class Box{
//     private int value;

//     Box(int value){
//         this.value = value;
//     }

//     public int getValue() {
//         return value;
//     }

//     public void setValue(int value) {
//         this.value = value;
//     }
// }

// class Box2{
//     private String value;

//     Box2(String value){
//         this.value = value;
//     }

//     public String getValue() {
//         return value;
//     }

//     public void setValue(String value) {
//         this.value = value;
//     }
// }


class Box{
    private Object value;

    Box(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
