public class polindrom {
    public static void main(String[] args) {
        String s = "bacecar";
        int L = 0;
        int R = s.length()-1;
        boolean result = true;

        while(L<R){
            if(s.charAt(L) != s.charAt(R)){
                result = false;
                break;
            }
            L++;
            R--;
        }
        System.out.println("Given String is Polindrom? " + result);
    }
}
