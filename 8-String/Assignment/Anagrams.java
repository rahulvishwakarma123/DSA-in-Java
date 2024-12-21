
import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "aabbc";

        if(anagrams(s1, s2)){
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }

    public static boolean anagrams(String s1, String s2){
        // corner case
        if(s1.length() != s2.length()){
            return false;
        }
        // convert to lower case
        s1.toLowerCase();
        s2.toLowerCase();
        // convert to char array
        char array1[] = s1.toCharArray();
        char array2[] = s2.toCharArray();
        // sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);
        // compare the arrays and returning the result
        return Arrays.equals(array1, array2);
    }

}