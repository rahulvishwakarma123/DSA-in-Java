public class RecLongestCommonSubsequence {
    // A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the ralative order of the remaining.
    // str1 = "abcde" , str2 = "ace"
    // ans = 3 // "ace"

    public static int rec(String s1, String s2, int n, int m){
        if (n < 0 || m < 0) {   // base case
            return 0;
        }
        int ans;
        if (s1.charAt(n) != s2.charAt(m)) {
            ans = Math.max(rec(s1, s2, n-1, m), rec(s1, s2, n, m-1));
        }
        else{
            ans = 1 + rec(s1, s2, n-1, m-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();

        int length = rec(str1, str2, n-1, m-1);
        System.out.println(length);
    }
}
