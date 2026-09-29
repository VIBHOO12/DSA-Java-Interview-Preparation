public class secondLargest {
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 20};
        int largest = Integer.MIN_VALUE; //-1
        int secondLargest = Integer.MIN_VALUE; //-1

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

           
        }
        System.out.println("second largest num: " + secondLargest);
    }
}
