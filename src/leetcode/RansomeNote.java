package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine  = "b";
        RansomeNote rn = new RansomeNote();
        boolean fetch = rn.ransomNote(ransomNote, magazine);
        System.out.println(fetch);
    }

    public boolean ransomNote(String ransomNote, String magazine
    ) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);

        }
        return true;
    }
}
