
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        Stack<Integer> st = new Stack<>();

        // adding elements in queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Original Queue: " + queue);
        while(!queue.isEmpty()){
            st.push(queue.poll());
        }
        while(!st.isEmpty()){
            queue.offer(st.pop());
        }


        System.out.println("Reverse Queue: " + queue);
    }
}
