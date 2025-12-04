package leetcode;

public class AddInteger {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 20;
        AddInteger ai = new AddInteger();
        int add = ai.addTwo(num, num1);
        System.out.println(add);
    }

    public int addTwo(int num, int num1) {
        return num + num1;
    }
}
