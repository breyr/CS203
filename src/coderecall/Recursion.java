package coderecall;

public class Recursion {

    public static String reverseString(String s) {
        // If the length of the string is <= 1 return whatever string gets sent in
        if (s.length() <= 1) {
            return s;
        }
        // smaller task is taking one character from the string
        char last = s.charAt(s.length() - 1);
        // Substring goes until the end
        String subS = s.substring(0, s.length() - 1);
        return last + reverseString(subS);
    }

    public static long factorial(long n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
        System.out.println(factorial(5));
    }
}
