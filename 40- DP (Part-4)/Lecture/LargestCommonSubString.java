public class LargestCommonSubString {
    // A substring is a contiguous sequence of characters of a string

    public static int tabLCS(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1) ) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans, dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABCCE";
        int n = str1.length();
        int m = str2.length();
        
        // int[] arr = new int[n];
        int ans = tabLCS(str1, str2, n, m);
        System.out.println(ans);
        
    }
}
