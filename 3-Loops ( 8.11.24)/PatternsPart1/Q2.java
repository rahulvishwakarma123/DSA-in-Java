// Print the following pattern.
//     * 
//    ** 
//   ***
//  **** 
// *****

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter any number:");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            // For Spaces
            for(int j = 1; j <= (num-i); j++){
                System.err.print(" ");
            }
            //For Stars
            for(int k = 1; k <= i; k++){
                System.err.print("*");
            }

            // For Next line.
            System.err.print("\n");

        }

        sc.close();
    }
}
