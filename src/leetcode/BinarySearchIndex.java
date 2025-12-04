package leetcode;

public class BinarySearchIndex {
    public static void main(String[] args) {
        int[] num = {-1, 0, 2, 3, 5, 8, 9};
        int target = 6;
        BinarySearchIndex bs = new BinarySearchIndex();
        int binary = bs.search(num, target);
        System.out.println(binary);
    }
    public int search(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
