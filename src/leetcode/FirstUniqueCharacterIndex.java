package leetcode;

import java.util.HashMap;

public class FirstUniqueCharacterIndex {
    public static void main(String[] args) {
        String abc = "loveleetCode";
        FirstUniqueCharacterIndex fu = new FirstUniqueCharacterIndex();
        int index = fu.firstUnique(abc);
        System.out.println(index);
    }

    public int firstUnique(String abc) {
        HashMap<Character, Integer> uniqueChar = new HashMap<>();
        for (char c : abc.toCharArray()) {
            uniqueChar.put(c, uniqueChar.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < abc.length(); i++) {
            if (uniqueChar.get(abc.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
