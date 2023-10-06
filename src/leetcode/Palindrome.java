package leetcode;

public class Palindrome {

    public static boolean isPalindrome(String x) {

        if (x.length() <= 1) {
            return true;
        }

        String beg = x.charAt(0) + "";
        String end = x.charAt(x.length() - 1) + "";

        if (!beg.equals(end)) {
            return false;
        } else {
            return isPalindrome(x.substring(1, x.length() - 1));
        }
    }

    public static boolean isPalindrome(int x) {
        // convert to string
        // if length is = 2 check both numbers
        // if length > 2 check first and last character
        // if these characters are the same continue
        return isPalindrome(String.valueOf(x));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
