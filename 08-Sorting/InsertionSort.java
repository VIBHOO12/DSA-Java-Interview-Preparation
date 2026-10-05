
import java.util.Arrays;


public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];

                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        
        int[] arr3 = {5, 2, 8, 1, 3};
        insertionSort(arr3);
        System.out.println("Insertion Sort: "
                + Arrays.toString(arr3));
    }
}
