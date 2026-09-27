
import java.util.*;

public class frequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2,5};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        // frequency.put(1, 4);
        // frequency.put(5, 4);
        // frequency.put(3, 6);
        // frequency.put(4, 2);
        // frequency.put(2, 10);

        // System.out.println(frequency);

        for(int i=0; i<arr.length; i++){
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("frequecy of key= value : " + frequency);
        // for(int num: arr){
        //     if(frequency.containsKey(num)){
        //         frequency.put(num, frequency.get(num)+1);
        //     }else{
        //          frequency.put(num, 1);
        //     }
           
        // }
        // System.out.println("frequecy of key= value : " + frequency);
    }
}
