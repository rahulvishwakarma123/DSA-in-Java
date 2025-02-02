public class UnboundedKnapsack {
    public static int tabUnboundedKnapasack(int[] val, int[] wt, int W, int[][] dp){
        int n = val.length;

        for (int i = 0; i < dp.length; i++) {  // 0th col = 0;
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1 ; j++) {
                int v = val[i-1];   // ith item val
                int w = wt[i-1];    // ith item weight

                if (w <= j) {   // we can include
                    //include 
                    int incProfit = v + dp[i][j-w];   
                    //exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int w = 7;
        int n = val.length;
        int[][] dp = new int[n+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length ; j++) {
                dp[i][j] = -1;
            }
        }
        int maxProfit = tabUnboundedKnapasack(val, wt, w, dp);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
