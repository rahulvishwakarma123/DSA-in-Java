public class EditDistaceTabulation {
    public static int tabEditDistance(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];
        // Initialization
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < m+1; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) { // same                  
                    dp[i][j] = dp[i-1][j-1];
                }
                else{ // different
                    int add = 1 + dp[i][j-1];
                    int delete = 1 + dp[i-1][j];
                    int replace = 1 + dp[i-1][j-1];                 
                    dp[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }
        // printarray(dp);
        return dp[n][m];
    }
    // public static void printarray(int[][] array){
    //     for (int i = 0; i < array.length; i++) {
    //         for (int j = 0; j < array[0].length; j++) {
    //             System.out.print(array[i][j] + " ");
    //         }
    //         System.out.println();            
    //     }
    // }
    public static void main(String[] args) {
        String word1 = "intention";
        String wort2 = "execution";
        System.out.println(tabEditDistance(word1, wort2));
           
    }
}
