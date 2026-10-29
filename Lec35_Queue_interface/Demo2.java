import java.util.PriorityQueue;

public class Demo2 {
    public static void main(String[] args) {

        // empty constructor -> min heap();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(50);
        pq.offer(60);
        pq.offer(40);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b)-> b-a);
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(20);
        pq1.offer(50);
        pq1.offer(60);
        pq1.offer(40);

        System.out.println(pq1);
        System.out.println(pq1.poll());

    }
}
