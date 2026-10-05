

public class TwoSumSorted {
   //  public static void main(String[] args) {
   //      int[] arr = {1,2,4,6,11,12};
   //      int target = 10;
   //      int left=0;
   //      int right=arr.length-1;
        
   //      while(left < right){
   //           int sum = arr[left] + arr[right];
   //           if(sum == target){
   //              System.out.println("pair: " + arr[left] + " , " + arr[right] );
   //              break;
   //           }
   //           else if(sum < target){
   //              left++;
   //           } else{
   //              right --;
   //           }
             
   //      }
   //  }

     public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right =numbers.length-1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                System.out.println("pair: " + numbers[left] + ", " + numbers[right]);
                break;
            } else if(sum <target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
        
    }
   public static void main(String[] args) {

      int[] numbers = {1,2,4,6,11,12};
      int target = 8;
      System.out.println(twoSum(numbers, target));
      
   }
}
