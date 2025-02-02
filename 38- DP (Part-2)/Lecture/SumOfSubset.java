public class SumOfSubset {

    public static boolean sumOfSubset(int[] val, int sum){
        int n = val.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i < dp.length; i++) {  // 0th col = 0;
            dp[i][0] = true;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];

                //valid
                if (v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                }
                // exclude
                if (dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] val = {4,2,7,1,3};
        int sum = 10;
        System.out.println(sumOfSubset(val, sum));
        
        
    }
}
