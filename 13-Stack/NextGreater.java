
import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    // using stack

      public static int[] nextGreaterElements(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Right to left traversal
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Find next greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Current element may help elements on the left
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1};

        // bruteforce approach
        for(int i=0; i<arr.length; i++){
            int ans = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    ans = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -> " + ans);
        }

        // using stack fucntion---nextGreaterElements
        int[] arr2 = {4, 5, 2, 10};

        int[] result = nextGreaterElements(arr2);

        System.out.println("Input:  " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
