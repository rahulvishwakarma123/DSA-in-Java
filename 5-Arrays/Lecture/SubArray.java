import java.util.*;

public class SubArray{

    public static void printSubArrays(int arr[]){


        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    int elem = arr[k];
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        //for the total of the subarrays 
        // Sum of n numbers is = n*(n+1)/2
        int TotalSubArrays = arr.length*(arr.length+1)/2;
        System.out.println(TotalSubArrays);
        
    }
    
    public static void main(String[] args) {


        int nums[] = {2,4,6,8,10};
        printSubArrays(nums);
    }
}