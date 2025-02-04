public class Leetcode474 {
    public static int rec(String[] arr, int m, int n, int idx, int[][][] dp){
        if (idx < 0) {
            return 0;
        }
        if (dp[idx][m][n] != -1) {
            return dp[idx][m][n];
        }
        String s = arr[idx];
        int length = s.length();
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '0') count0++;
            else count1++;
        }
        // valid 
        if (count0 <= m && count1 <= n) {
            // Include.
            int ans1 = 1 + rec(arr, m - count0, n - count1, idx - 1, dp);

            // Exclude
            int ans2 = rec(arr, m, n, idx - 1, dp);

            dp[idx][m][n] = Math.max(ans1, ans2);
            return dp[idx][m][n];
        }
        else{   // Invalid

            // Exclude
            int ans2 = rec(arr, m, n, idx - 1, dp);
            dp[idx][m][n] = ans2;
            return dp[idx][m][n];
        }
    }
    public static void main(String[] args) {
        String[] strs = {"10","0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int idx = strs.length;
        int[][][] dp = new int[idx+1][m+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                for (int j2 = 0; j2 < dp[0][0].length; j2++) {
                    dp[i][j][j2] = -1;
                }
            }
        }
        System.out.println(rec(strs,m,n,idx-1,dp));
    }
}
