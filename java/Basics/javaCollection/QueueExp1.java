
import java.util.*;

class QueueExp1 {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq); // [10, 30, 20] (internal order)
        System.out.println("Peek: " + pq.peek());   // 10
        System.out.println("Poll: " + pq.poll());   // 10
        System.out.println("Poll: " + pq.remove());   // 10
        System.out.println("Poll: " + pq.remove());   // 10
        System.out.println("Poll: " + pq.poll());   // 10

        System.out.println("After Poll: " + pq);    // [20, 30]
    }
}
