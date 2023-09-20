public class Basics {
    public static long factorial(long n) {
        // needs to be long because int can't hold that big of number
        return (n == 0) ? 1 : factorial(n - 1) * n;
    }

    public static String backwardString(String message) {
        if (message.length() <= 1) {
            return message;
        }
        char last = message.charAt(message.length() - 1);
        String leftOver = message.substring(0, message.length() - 1);
        return last + backwardString(leftOver);
    }

    public static void main(String[] args) {
        System.out.println(backwardString("Hello World!"));
    }
}
