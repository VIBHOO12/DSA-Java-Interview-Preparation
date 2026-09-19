public class Day01_ArraysBasics {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 1. Traverse
        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2. Sum
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("\nSum = " + sum);

        // 3. Maximum
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);

        // 4. Minimum
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);

        // 5. Reverse
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}