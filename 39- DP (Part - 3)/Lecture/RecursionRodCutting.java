public class RecursionRodCutting {
    public static int rec(int[] len, int[] prise, int totalLength, int index){
        if (totalLength <= 0 || index < 0) {
            return 0;
        }

        if (len[index] <= totalLength) { // Valid
            // Include
            int ans1 = prise[index] + rec(len, prise, totalLength - len[index], index-1);
            // Exclude
            int ans2 = rec(len, prise, totalLength, index-1);
            return Math.max(ans1, ans2);
        }
        else{   // Invalid
            // Exclude
            int ans2 = rec(len, prise, totalLength, index-1);
            return ans2;
        }
    }
    public static void main(String[] args) {
        int[] prise = {1,5,8,9,10,17,17,20};
        int[] lenght = {1,2,3,4,5,6,7,8};
        int totalLength = 8;
        int n = lenght.length;
        System.out.println(rec(lenght, prise, totalLength, n-1));
    }
}
