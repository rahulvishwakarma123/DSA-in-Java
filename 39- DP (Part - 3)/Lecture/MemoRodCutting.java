public class MemoRodCutting {
    public static int rec(int[] len, int[] prise, int totalLength, int index, int[][] dp){
        if (totalLength <= 0 || index < 0) {
            return 0;
        }
        if (dp[index][totalLength] != -1) {
            return dp[index][totalLength];
        }

        if (len[index] <= totalLength) { // Valid
            // Include
            int ans1 = prise[index] + rec(len, prise, totalLength - len[index], index-1,dp);
            // Exclude
            int ans2 = rec(len, prise, totalLength, index-1,dp);
            dp[index][totalLength] = Math.max(ans1, ans2);
            return dp[index][totalLength];
        }
        else{   // Invalid
            // Exclude
            int ans2 = rec(len, prise, totalLength, index-1,dp);
            dp[index][totalLength] = ans2;
            return dp[index][totalLength];
        }
    }
    public static void main(String[] args) {
        int[] prise = {1,5,8,9,10,17,17,20};
        int[] lenght = {1,2,3,4,5,6,7,8};
        int totalLength = 8;
        int n = lenght.length;
        int[][] dp = new int[n+1][totalLength + 1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < totalLength+1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(rec(lenght, prise, totalLength, n-1,dp));
    }
}
