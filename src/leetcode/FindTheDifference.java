package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcdef";
        FindTheDifference fd = new FindTheDifference();
        char extraChar = fd.findTheDifference(a, b);
        System.out.println(extraChar);
    }

    public char findTheDifference(String a, String b) {
        Map<Character, Integer> findChar = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (findChar.containsKey(ch)) {
                findChar.put(ch, findChar.get(ch) + 1);
            } else {
                findChar.put(ch, 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (!findChar.containsKey(ch) || findChar.get(ch) == 0) {
                return ch;
            } else {
                findChar.put(ch, findChar.get(ch) - 1);
            }
        }
        return 0;
    }
}
