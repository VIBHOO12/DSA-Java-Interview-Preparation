public class SlidingWindowSum {

    // maximum Sum
    public static int maxsum(int[] arr, int k){
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];

        }
        int maxsum = windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i-k];
            maxsum = Math.max(maxsum, windowSum);
        }
        return maxsum;
    }

    // Minimum Sum
    public static int minsum(int[] arr, int k){

        int windowMinSum = 0;
        for(int i=0; i<k; i++){
            windowMinSum += arr[i];
        }

        int minsum = windowMinSum;
        for(int i=k; i<arr.length; i++){
            windowMinSum = windowMinSum + arr[i-k];
            windowMinSum = Math.min(minsum, windowMinSum);
        }

        return minsum;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,8,7};
        int k=3;
        System.out.println("sliding window maximum sum: "+ maxsum(arr, k));
        System.out.println("sliding window minimum sum: "+ minsum(arr, k));

       

    }
}
