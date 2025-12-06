package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int reverse = 0;
        PalindromeNumber pn = new PalindromeNumber();
        boolean palindrome = pn.isPalindrome(x);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        if (x >= 0) {
            return reverseNumber(x) == x;
        } else {
            return false;
        }
    }

    public int reverseNumber(int x) {
        int reverse = 0;
        while (x > 0) {
            int lasdigit = x % 10;
            reverse = reverse * 10 + lasdigit;
            x = x / 10;
        }
        return reverse;
    }
}
