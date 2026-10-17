import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void offer(int x) {
        input.push(x);
    }

    public int poll() {
        moveElements();

        if (output.isEmpty()) {
            return -1;
        }

        return output.pop();
    }

    public int peek() {
        moveElements();

        if (output.isEmpty()) {
            return -1;
        }

        return output.peek();
    }

    private void moveElements() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.peek()); // 10
        System.out.println(q.poll()); // 10
        System.out.println(q.poll()); // 20
    }
}