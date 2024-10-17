package packages.collections;
import java.util.ArrayDeque;


public class LearnArraysDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(56);
        adq.offerFirst(34);
        adq.offerLast(78);
         
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst()"+adq);

        System.out.println(adq.pollLast());
        System.out.println("polllast()"+ adq);
    }
}
