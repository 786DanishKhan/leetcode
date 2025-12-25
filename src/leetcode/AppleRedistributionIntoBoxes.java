package leetcode;


public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};
        int result = appleBoxes(apple, capacity);
        System.out.println(result);
    }

    public static int appleBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for (int a : apple) {
            totalApples = totalApples + a;
        }
        int boxes = 0;
        for (int i = capacity.length - 1; i >= 0 && totalApples > 0; i--) {
            totalApples = totalApples - capacity[i];
            boxes++;
        }
        return totalApples <= 0 ? boxes : -1;

    }
}
