
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "SHRUTI";
        Stack<Character> stack = new Stack<>();

        // for push all character into stack
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        System.out.println("original stack: " + stack);
        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        System.out.println("original string: " + str);
        System.out.println("reverse string: " + reverse);

    }
}
