import java.util.Arrays;
import java.util.HashSet;

public class LongestIncresingSubsequence {

    public static int tabulationLIS(int[] arr1, int[] arr2){
        int n = arr1.length; int m = arr2.length;
        int[][] dp = new int[n+1][m+1];
        // Initialization
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < m+1; i++) {
            dp[0][i] = 0;
        }
        int ans;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    ans = 1 + dp[i-1][j-1];
                    dp[i][j] = ans;
                } else {
                    ans = Math.max(dp[i-1][j], dp[i][j-1]);
                    dp[i][j] = ans;
                }
            }
        }
        return dp[n][m];
    }
    public static int LIS(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] arr2 = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2);
        int ans = tabulationLIS(arr, arr2);
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {50, 3, 10, 7, 40, 80};
        System.out.println(LIS(arr));
    }
}