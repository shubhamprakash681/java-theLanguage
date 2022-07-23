package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(12);
        que.offer(123);
        que.offer(35);
        que.offer(97);
        que.offer(987);
        System.out.println(que);

        Iterator<Integer> itr = que.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());
    }
}
