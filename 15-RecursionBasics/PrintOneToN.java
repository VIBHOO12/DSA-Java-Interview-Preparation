public class PrintOneToN {
    
    static void printOneToN(int n){
    
        if(n==0){
            return;
        }

        
        printOneToN(n-1);
        System.out.print(n+ " ");
        
    }

    
   
    public static void main(String[] args) {
        printOneToN(10);
        
    }
}
