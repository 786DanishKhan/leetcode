package leetcode;

public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        FirstOccurence ftd = new FirstOccurence();
        int occur = ftd.first(haystack, needle);
        System.out.println(occur);
    }

    public int first(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
