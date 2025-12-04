package leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        ClimbingStairs cs = new ClimbingStairs();
        int ways = cs.climbingStairs(n);
        System.out.println(ways);
    }

    public int climbingStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
