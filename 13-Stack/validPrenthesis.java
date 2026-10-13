
import java.util.Stack;

public class validPrenthesis {
    
    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();

                if(ch == ')' && top == '('){
                    stack.pop();
                }else if(ch == '}' && top == '{'){
                    stack.pop();
                }else if(ch == ']' && top == '['){
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
            String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "{[]}";
        String s4 = "([)]";
        String s5 = "(((";

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));
        System.out.println(s4 + " -> " + isValid(s4));
        System.out.println(s5 + " -> " + isValid(s5));
    }
}
