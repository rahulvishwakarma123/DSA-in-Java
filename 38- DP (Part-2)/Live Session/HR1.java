import java.util.*;
class HR1 {
    public static int rec(int[] nums,int[] dp, int n, int i){
        if(i>=n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int ans = 0;
        int take = nums[i] + rec(nums,dp,n,i+2);
        int notTake = rec(nums,dp,n,i+1);

        ans = Math.max(take,notTake);

        dp[i] = ans;
        return ans;
    }
    public int rob(int[] nums,int index) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return rec(nums,dp,n+1,0);
    }
}
