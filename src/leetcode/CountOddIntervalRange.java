package leetcode;

public class CountOddIntervalRange {
    public static void main(String[] args) {
        int low = 3, high = 7;
        CountOddIntervalRange cd = new CountOddIntervalRange();
        int result = cd.countOdd(low, high);
        System.out.println(result);
    }

    public int countOdd(int low, int high) {
        int result;
        if (low % 2 == 0 && high % 2 == 0) {
            result = (high - low) / 2;
        } else {
            result = (high - low) / 2 + 1;
        }
        return result;
    }
}
