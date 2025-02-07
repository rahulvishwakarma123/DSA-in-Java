public class TabLongestCommonSubsequence {
    // A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the ralative order of the remaining.
    // str1 = "abcde" , str2 = "ace"
    // ans = 3 // "ace"

    public static int tabLCS(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];

        // initialization
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < m+1; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1) ) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        // String str1 = "abcde";
        // String str2 = "ace";
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();

        System.out.println(tabLCS(str1, str2, n, m));
        
        
    }
}
