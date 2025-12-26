package leetcode;


public class DeleteColumnToMakeSorted {
    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
        int i = minDeletionSize(strs);
        System.out.println(i);
    }

    public static int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        for (int col = 0; col < cols; col++) {
            for (int row = 1; row < rows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
