public class LargestCommonSubString {
    // A substring is a contiguous sequence of characters of a string

    public static int rec(String str1, String str2, int n, int m, int[][] dp){
        if (m < 0 || n < 0) {
            return 0;
        }
        if (dp[n][m] != 0) {
            return dp[n][m];
        }
        int ans;
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            ans = 1 + rec(str1, str2, n-1, n-1, dp);
            dp[n][m] = ans;
            return ans;
        }
        else {
            ans = 0;
            dp[n][m] = ans;
        }
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = 0;
            }
        }
        int[] arr = new int[n];
        rec(str1, str2, n, m, dp);
    }
}
