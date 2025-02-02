public class ClimbingStairsTabulation {
    public static int countWaysTab(int n){
        int[] ways = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i < ways.length; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }    
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(countWaysTab(n));
        
    }
}
