public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int unique = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[unique] = arr[i];
                unique++;
            }
        }
        System.out.print("unique arr: ");
        for(int i=0; i<unique; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
