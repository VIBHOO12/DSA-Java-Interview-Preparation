
import java.util.HashMap;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbcdde";
        HashMap<Character, Integer> charFreq = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charFreq.put(ch,
                    charFreq.getOrDefault(ch, 0) + 1);
        }

        char firstNonRepeating = '\0';

        for (char ch : str.toCharArray()) {

            if (charFreq.get(ch) == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        System.out.println(
                "3. First Non-Repeating Character: "+ firstNonRepeating);
    }
}
