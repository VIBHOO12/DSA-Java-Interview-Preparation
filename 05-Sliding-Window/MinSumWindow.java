public class MinSumWindow {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 3, 6};
        int k = 3;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            minSum = Math.min(minSum, windowSum);
        }

        System.out.println("Minimum Sum = " + minSum);
    }
}
