package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //implements as min-heap
        pq.offer(12);
        pq.offer(123);
        pq.offer(564);
        pq.offer(1);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
//        implemented as max-heap
        pqr.offer(0);
        pqr.offer(213);
        pqr.offer(2);
        pqr.offer(435);
        System.out.println(pqr);


    }
}
