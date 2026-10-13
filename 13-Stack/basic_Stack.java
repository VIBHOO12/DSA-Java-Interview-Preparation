import java.util.Stack;

public class basic_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);
        System.out.println("peak element: " + stack.peek());
        System.out.println("Stack: " + stack.isEmpty());
        System.out.println("remove element: " + stack.pop());
        System.out.println("Stack: " + stack.peek());

    }
}
