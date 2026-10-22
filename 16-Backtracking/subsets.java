
import java.util.*;


public class subsets {

    static void generateSubsets(int[] arr, int index, List<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
          // Choice 1: current element include karo
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // Backtrack: last added element hatao
        current.remove(current.size() - 1);

        // Choice 2: current element exclude karo
        generateSubsets(arr, index + 1, current);
    }
  public static void main(String[] args) {
    int[] arr = {1, 2};

        generateSubsets(
            arr, 0, new ArrayList<>()
        );
  }  
}
