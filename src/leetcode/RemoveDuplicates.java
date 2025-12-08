package leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        RemoveDuplicates rd = new RemoveDuplicates();
        int remove = rd.removeDuplicate(nums);
        System.out.println(remove);
    }
    public int removeDuplicate(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
            }
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
