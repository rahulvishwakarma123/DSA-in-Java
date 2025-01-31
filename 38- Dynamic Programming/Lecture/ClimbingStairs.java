public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n+1];
        System.out.println(countWays(n, ways));
    }
    public static int countWays(int n, int[] arr) {
        if (n == 1 || n == 0) {
            return 1; 
        }
        else if(n < 0){
            return 0;
        }
        if (arr[n] != 0) { 
            return arr[n];
        }
        arr[n] = countWays(n-2, arr) + countWays(n-1, arr);
        return arr[n];
    }
}
