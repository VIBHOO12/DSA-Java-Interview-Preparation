public class countLastWord {

    public static int lengthOfLastWord(String s) {
        String[] word = s.trim().split(" ");
        return word[word.length-1].length();
    }
    public static void main(String[] args){
        String s = "Hello world vibhoo";
        System.out.println(lengthOfLastWord(s));
    }
}
