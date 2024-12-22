public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("It's Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
