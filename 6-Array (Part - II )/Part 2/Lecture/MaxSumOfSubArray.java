// Calculate the sum of the subArrays (Your broot force apprpach.)

public class MaxSumOfSubArray {

    public static void SubArraySum(int arr[]){
       int currSum = 0;
       int maxSum = 0;
       for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            for (int j2 = i; j2 <= j; j2++) {
                currSum += arr[j2];
            }
            if (maxSum<currSum) {
                maxSum = currSum;
            }
            currSum = 0;
        }
    }
    System.out.println(maxSum);
    
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        SubArraySum(arr);
    }
}