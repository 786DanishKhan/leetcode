package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = " fly me  to the moon";
        LengthOfLastWord lw = new LengthOfLastWord();
        int length = lw.lengthOfWord(s);
        System.out.println(length);
    }

    public int lengthOfWord(String s) {
        s = s.trim();
        System.out.println(s);
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
