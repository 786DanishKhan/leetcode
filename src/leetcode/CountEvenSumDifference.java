package leetcode;

public class CountEvenSumDifference {
    public static void main(String[] args) {
        int[] nums = {10, 10, 3, 7, 6};
        CountEvenSumDifference ce = new CountEvenSumDifference();
        int ans = ce.countPartitions(nums);
        System.out.println(ans);
    }

    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum % 2 == 0) {
                return nums.length - 1;
            }
        }
        return 0;
    }
}
