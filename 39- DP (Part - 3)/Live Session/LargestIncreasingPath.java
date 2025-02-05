import java.util.*;
 
public class LargestIncreasingPath {
 
    public static int longestIncPath(int[][] mat, int[][] dp, int i, int j, int n, int m) {
        if(i>n || j>m || i<0 || j<0) {
            return 0;
        } 
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 1;
 
        if(i+1 < n && mat[i][j] < mat[i+1][j]) {
            ans = Math.max(ans, 1 + longestIncPath(mat, dp, i+1, j, n, m));
        }
 
        if(j+1 < m && mat[i][j] < mat[i][j+1]) {
            ans = Math.max(ans, 1 + longestIncPath(mat, dp, i, j+1, n, m));
        }
 
        if(j-1 >= 0 && mat[i][j] < mat[i][j-1]) {
            ans = Math.max(ans, 1 + longestIncPath(mat, dp, i, j-1, n, m));
        }
 
        if(i-1 >= 0 && mat[i][j] < mat[i-1][j]) {
            ans = Math.max(ans, 1 + longestIncPath(mat, dp, i-1, j, n, m));
        }
        System.out.println("Cell : " + i + "," + j + "==>" + ans);
        return dp[i][j] = ans;
    }
    public static void main(String[] args) {
        int[][] mat = 
        {
            {9,9,4},
            {6,6,8},
            {2,1,1},
        };
        int n = mat.length;
        int m = mat[0].length;
 
        int[][] dp = new int[n][m];
 
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
 
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                ans = Math.max(longestIncPath(mat, dp, i, j, n, m), ans);
            }
        }
 
        System.out.println(ans);
 
    }
}