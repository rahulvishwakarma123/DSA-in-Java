// Print the following diamond pattern.
//    *    
//   ***
//  ***** 
// ******* 
//  ******* 
//   ***** 
//    *** 
//     *


import java.util.Scanner;

public class Q9 {

    public static void diamondPattern(int n){
       
        // Upper half 
        for (int i = 1; i <= n; i++) {
            
            // for spaces
            for (int j = 1; j <= (n-i); j++) {
                System.err.print(" ");
            }
            //for stars
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.err.print("*");
            }
            System.err.println();
        }


        //Lower half
        for (int i = n; i >= 1; i--) {
            
            // for spaces
            for (int j = 0; j <= n-i; j++) {
                System.err.print(" ");
            }
            //for stars
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.err.print("*");
            }
            System.err.println();
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any number.");
        int n = sc.nextInt();

        diamondPattern(n);

        sc.close();
    }
}
