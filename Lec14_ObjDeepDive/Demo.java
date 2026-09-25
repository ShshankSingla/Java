public class Demo {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1);

        System.out.println("r1.x: " + r1.x + " r1.y: " + r1.y
                + " r2.x: " + r2.x + " r2.y: " + r2.y);

        addTen(r2);

        System.out.println("r1.x: " + r1.x + " r1.y: " + r1.y
                + " r2.x: " + r2.x + " r2.y: " + r2.y);
    }

    static void addTen(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random {

    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Random(Random r) {
        this.x = r.x;
        this.y = r.y;
    }
}