package lab;

public class Test {

    public static String reverse(String msg) {
        if (msg.length() == 0) {
            return msg;
        }
        return reverse(msg.substring(1)) + msg.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("cast"));
    }
}