package packages.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LeranLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(45);
        queue.offer(66); // it is  method use for add element in queue
        queue.offer(44);
        queue.offer(33);
        queue.offer(67);
        queue.offer(64);
        System.out.println(queue);
        System.out.println(queue.poll());// this method is used for delete the element from the queue
       System.out.println(queue.peek()); // peeek function basically means that it return the next value which will come
    }
}
