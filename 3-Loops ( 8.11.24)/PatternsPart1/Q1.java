// Print the Hollow rectangle pattern.
// *****
// *   * 
// *   * 
// ***** 

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number.");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){                              // 1

            // For the first and last line.
            
            if (i == 1 || i == num) {
                for(int j = 0; j < num; j++){
                    System.out.print("*");
                }
            }
            
            // For the middle of the patterns.
            else{
                System.err.print("*");
                for(int j = 1; j <= (num-2); j++ ){
                    System.err.print(" ");
                }
                System.err.print("*");
            }

            //For printing the next line.
            System.err.print("\n");
        }

        sc.close();
    }
}
