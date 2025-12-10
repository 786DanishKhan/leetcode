package leetcode;

public class CountSquareSumTriple {
    public static void main(String[] args) {
        int n = 10;
        CountSquareSumTriple sqre = new CountSquareSumTriple();
        int result = sqre.countTriple(n);
        System.out.println(result);
    }

    public int countTriple(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                long sum = (long) a * a + (long) b * b;
                int c = (int) Math.sqrt(sum);
                if ((long) c * c == sum && c <= n) {
                    System.out.println("The square triples are: "+a + "," + b + "," + c);
                    count++;
                }
            }
        }
        return count;
    }
}