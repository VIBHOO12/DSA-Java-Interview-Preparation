
public class Day02_ArrayPatterns {
    public static void main(String[] args) {
       int[] arr = {2, 5, 2, 8, 2, 5};

    //    frequency
        int target = 2; //3
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.print(count + "\n");


// prefix sum
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int num :prefix){
            System.out.print(num + " " );
        }
        

        // Count Positive & Negative
        int[] arr2 = {-2, 5, -7, 8, 10, -1,4,9};
        int positiveCount = 0; //5
        int negativeCount = 0; //3
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] >0){
                positiveCount++;
            } else{
                negativeCount++;
            }
        }
        System.out.print("\n" + positiveCount + ", " + negativeCount);
    }



    
}
