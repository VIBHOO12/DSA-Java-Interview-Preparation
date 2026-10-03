
public class bubbleSort {
    public static void bubbleSorting(int[] arr){
        int n=arr.length-1;
        boolean swapped = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            // already sorted
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1,3,6,4,2,1};
        bubbleSorting(arr);


        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
