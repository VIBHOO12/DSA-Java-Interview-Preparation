
import java.util.HashMap;

public class frequencyCount {
    
    public static HashMap<Integer, Integer> freqCheck(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,4,3,1};
        System.out.println("frequency: " + freqCheck(arr));

    }
}
