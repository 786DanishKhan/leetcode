package leetcode;

public class MaximumRunningTime {
    public static void main(String[] args) {
        int n = 2;
        int[] batteries = {3, 3, 3};
        MaximumRunningTime mr = new MaximumRunningTime();
        long mrt = mr.maxRunTime(n, batteries);
        System.out.println(mrt);
    }

    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) {
            sum = sum + b;
        }
        long low = 0, high = sum / n;

        while (low < high) {
            long mid = high - (high - low) / 2;

            if (canRun(mid, batteries, n))
                low = mid;
            else
                high = mid - 1;
        }
        return low;
    }

    private boolean canRun(long minutes, int[] batteries, int n) {
        long total = 0;

        for (int b : batteries) {
            total = total + Math.min(b, minutes);
        }
        return total >= (long) minutes * n;
    }
}
