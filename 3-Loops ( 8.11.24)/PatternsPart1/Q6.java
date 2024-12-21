//Print the following Solid Rhombus patter.
//     ********** 
//    **********
//   **********
//  **********
// **********

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any number to print the pattern.");
        int n = sc.nextInt();

        //Outer loop
        for(int i = 1; i <= n; i++){

            //1st inner loop for the spaces.
            for(int j = n; j > i; j--){
                System.err.print(" ");
            }

            //2nd inner loop for the stars.
            for(int j = 1; j <= n; j++){
                System.err.print("*");
            }

            System.err.println();

        }
        sc.close();
    }
}
