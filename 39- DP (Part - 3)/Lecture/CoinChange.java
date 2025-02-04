public class CoinChange {
    public static int tabulationCoinChange(int[] coins, int sum){
        int n = coins.length;
        int [][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < n+1; i++) { // 0th col = 1
            dp[i][0] = 1;
        }
        for (int i = 1; i < sum + 1; i++) {    // 0th row = 0
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                // Valid condition.
                if (coins[i-1] <= j) {
                    // include.
                    int ans1 = dp[i][j-coins[i-1]];
                    // Exclude.
                    int ans2 = dp[i-1][j];

                    dp[i][j] = ans1 + ans2;
                }
                // Invalid condition.
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {2,3,5,6};
        int sum = 10;
        
        System.out.println(tabulationCoinChange(coins, sum));
        
    }
}
