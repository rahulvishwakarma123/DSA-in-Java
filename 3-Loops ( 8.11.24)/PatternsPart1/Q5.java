// Print the following butterfly pattern.
// *      * 
// **    ** 
// ***  *** 
// ******** 
// ******** 
// ***  *** 
// **    ** 
// *      * 


import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter a number to print the star pattern:");
        int num = sc.nextInt();

        //Upper Outer Loop
        for(int i = 1; i<=num; i++){

            // 1st inner loop to print the stars
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }

            // 2nd inner loop to print the spaces
            for(int m = 1; m <= 2*(num-i); m++){
                System.err.print(" ");
            }
            
            // 3rd inner Loop for stars
            for(int n = 1; n <= i; n++){
                System.out.print("*");
            }
            System.err.println();
        }

        //Upper Lower Loop
        for(int i = 0; i<=num; i++){

            // 1st inner loop to print the stars
            for(int l = num; l > i; l--){
                System.out.print("*");
            }

            // 2nd inner loop to print the spaces
            for(int l = 0; l < 2*i; l++){
                System.out.print(" ");
            }
            
            // 3rd inner Loop for stars
            for(int l = num; l > i; l--){
                System.out.print("*");
            }
            System.err.println();
        }
        sc.close();
    }    
}
