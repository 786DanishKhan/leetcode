package leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,4,2};
        MissingNumber mn = new MissingNumber();
        int miss = mn.missingNumber(nums);
        System.out.println(miss);
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
