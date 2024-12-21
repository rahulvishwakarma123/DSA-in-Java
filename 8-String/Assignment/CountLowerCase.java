public class CountLowerCase {

    public static int countLowercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Number of lowercase letters in the string: " + countLowercase(str));
    }
}