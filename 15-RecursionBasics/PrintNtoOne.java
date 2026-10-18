
public class PrintNToOne {
    static void printOneToN(int n){
    
        if(n==0){
            return;
        }

        
        
        System.out.print(n+ " ");
        printOneToN(n-1);
        
    }

    
   
    public static void main(String[] args) {
        printOneToN(10);
        
    }
}
