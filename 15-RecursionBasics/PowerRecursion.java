public class PowerRecursion {
    static long power(int base, int n){
        if(n==0){
            return 1;
        }

        return base * power(base, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
