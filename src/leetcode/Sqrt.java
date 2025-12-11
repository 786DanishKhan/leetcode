package leetcode;

public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        Sqrt s = new Sqrt();
        int squre = s.sqrt(x);
        System.out.println(squre);
    }

    public int sqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
