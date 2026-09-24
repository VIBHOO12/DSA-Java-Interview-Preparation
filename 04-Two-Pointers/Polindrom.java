public class Polindrom {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPolindrom = true;
        int left = 0; 
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                isPolindrom = false;
                break;
            }
            left++;
            right--;

        }
        System.out.println(isPolindrom);
    }
}
