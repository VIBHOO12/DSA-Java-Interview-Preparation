
import java.util.HashSet;

public class DuplicateNum {

    // check duplicate key
    public static boolean duplicateNum(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    // only print first num who is repeated and ignore next repeating num
    public static int findDuplicat(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {6,3,2,2,3,1};
        System.out.println("Duplicate number: " +duplicateNum(arr));
        System.out.println("first duplicate num: "+findDuplicat(arr));
        
    }
}
