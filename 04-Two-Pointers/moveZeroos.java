public class moveZeroos {
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,12};
        int insertPos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[insertPos];
                arr[insertPos] = temp;

                insertPos++;
            }
        }

        for(int num:arr){
            System.out.print(num + ", ");
        }
        

    }
}
