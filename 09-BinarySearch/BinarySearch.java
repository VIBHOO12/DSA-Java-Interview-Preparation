public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){


            int mid = left + (right-left) / 2;

            if(arr[mid] ==  target){
                return mid;
            } else if(arr[mid] < target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static int firstOccurrence(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    int answer = -1;

    while (left <= right) {

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {

            answer = mid;

            // Search further left
            right = mid - 1;

        } else if (arr[mid] < target) {

            left = mid + 1;

        } else {

            right = mid - 1;
        }
    }

    return answer;
}
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 0;
        // System.out.println(binarySearch(arr, target));
        System.out.println(firstOccurrence(arr, target));
    }
}
