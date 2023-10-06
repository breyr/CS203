import java.util.HashMap;

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

    public static int rabbits(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n < 3) {
            return 1;
        }
        int value = rabbits(n - 1, memo) + rabbits(n - 2, memo);
        memo.put(n, value);
        return value;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(rabbits(10, memo));
    }
}
