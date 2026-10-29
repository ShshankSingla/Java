// Iterable
//     |
// Collection
//     |
//   Queue
//     |
//    DEQ
//     |
// Array Deque

import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //  3   2   1
        //  |       |
        // Rear    Front

        // single ended queue

        //enqueue
        queue.add(1); // exception

        //safer version
        queue.offer(2); // never return exception, return false;
        queue.offer(3);

        // front access
        System.out.println(queue.peek()); // return null but doesn't throw exception
        System.out.println(queue.element()); // can throw exception

        // element remove
        System.out.println(queue.remove()); // unsafe
        System.out.println(queue.poll()); // safe

    }
}
