package queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(234);
        adq.offerFirst(12);

        System.out.println(adq);
    }
}
