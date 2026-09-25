// there is no call by reference in java

public class CallByReference {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        Random r = new Random(x,y);

        System.out.println("Before function call: ");
        System.out.println(r.x+ " and "+ r.y);

        addTen(r);

        System.out.println("After function call: ");
        System.out.println(r.x + " " + r.y);
    }

    public static void addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random{
    int x;
    int y;

    Random(int x, int y){
        this.x = x;
        this.y = y;
    }


}
