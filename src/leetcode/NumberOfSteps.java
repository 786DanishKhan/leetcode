package leetcode;

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        NumberOfSteps ns = new NumberOfSteps();
        int steps = ns.numberOfSteps(num);
        System.out.println(steps);
    }

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
