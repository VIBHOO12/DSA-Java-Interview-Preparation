public class Day03_Strings {

    public static void main(String[] args) {

        // 1. Count Vowels
        String s1 = "programming";
        int vowels = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = Character.toLowerCase(s1.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("1. Vowels = " + vowels);


        // 2. Count Digits
        String s2 = "java123";
        int digits = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (Character.isDigit(s2.charAt(i))) {
                digits++;
            }
        }

        System.out.println("2. Digits = " + digits);


        // 3. Reverse String
        String s3 = "developer";
        StringBuilder reverse = new StringBuilder();

        for (int i = s3.length() - 1; i >= 0; i--) {
            reverse.append(s3.charAt(i));
        }

        System.out.println("3. Reverse = " + reverse);


        // 4. Check Palindrome
        String s4 = "racecar";

        int left = 0;
        int right = s4.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (s4.charAt(left) != s4.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("4. Palindrome = " + palindrome);


        // 5. Character Frequency
        String s5 = "banana";

        int[] freq = new int[26];

        for (int i = 0; i < s5.length(); i++) {
            char ch = s5.charAt(i);
            freq[ch - 'a']++;
        }

        System.out.println("5. Character Frequency:");

        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {
                System.out.println(
                    (char) (i + 'a') + " = " + freq[i]
                );
            }
        }
    }
}