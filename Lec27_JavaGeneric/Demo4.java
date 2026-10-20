public class Demo4 {
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<Integer, Integer>(2,3);
        System.out.println(p1.first + " , " + p1.second);

        Pair<String, Integer> p2 = new Pair<>("Hello", 5);
        System.out.println(p2.first + " , " + p2.second);

    }
}

class Pair<T, U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

}
