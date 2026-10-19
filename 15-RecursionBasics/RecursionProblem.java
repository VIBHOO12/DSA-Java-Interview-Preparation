public class RecursionProblem {

    static int sumN(int n){
        if(n<=1){
            return 0;
        }

        return n + sumN(n-1);
    }

     static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n * factorial(n-1);
    }

    static int fib(int n){
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

      static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("sum of N: " +  sumN(5));
        System.out.println("factorial of N: " + factorial(5));
        System.out.println("fibonacci of N: " + fib(5));
         System.out.println("reverse of string: " + reverse("java"));
    }
}
