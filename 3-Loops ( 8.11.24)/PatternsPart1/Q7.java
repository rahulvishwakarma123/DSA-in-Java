// print the following hollow rhombus star pattern.
//     ***** 
//    *   * 
//   *   * 
//  *   *  
// *****


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any number to print the pattern.");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = n; j>i; j--){
                System.err.print(" ");
            }


            if (i==1 || i == n) {
                for(int j = 1; j <= n; j++){
                    System.err.print("*");
                }
            }
            
            else{
                System.err.print("*");
                for(int j = 1; j <= (n-2); j++){
                    System.err.print(" ");
                }
                System.err.print("*");
            }

            
            System.err.println();
        }

        sc.close();
    }
}
