
import java.util.HashMap;

public class HashMapTwoSum {
    public static void main(String[] args) {
         int[] twoSumArray = {2, 4, 11,6, 3, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < twoSumArray.length; i++) {

            int required = target - twoSumArray[i];

            if (map.containsKey(required)) {
                index1 = map.get(required);
                index2 = i;
                break;
            }

            map.put(twoSumArray[i], i);
        }

        System.out.println(
                "4. Two Sum Indices: "
                        + index1 + ", " + index2
        );
    }
}
