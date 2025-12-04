package leetcode;

public class BinarySearchIndex_1 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 2, 6, 8, 10};
        int target = 9;
        BinarySearchIndex_1 bs = new BinarySearchIndex_1();
        int binarySearch = bs.binarySearch(nums, target);
        System.out.println(binarySearch);
    }
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
