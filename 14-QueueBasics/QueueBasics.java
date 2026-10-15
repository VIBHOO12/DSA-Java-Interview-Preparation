import java.util.ArrayDeque;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
         Queue<Integer> queue = new ArrayDeque<>();

        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // See front element
        System.out.println("Front: " + queue.peek());

        // Remove front element
        System.out.println("Removed: " + queue.poll());

        // Queue after removal
        System.out.println("After poll: " + queue);

        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
