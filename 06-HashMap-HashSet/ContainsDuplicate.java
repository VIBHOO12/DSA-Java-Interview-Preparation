import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        boolean result = false;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                result = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println("2. Contains Duplicate: " + result);
        
       
    }
}
