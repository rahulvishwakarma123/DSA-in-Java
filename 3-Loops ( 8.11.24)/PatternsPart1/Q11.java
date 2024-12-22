// Print the following PALINDROMIC with number pattern.
//     1
//    212
//   32123
//  4321234
// 543212345
import java.util.Scanner;

public class Q11 {

    public static void palindromicNumberPattern(int n){
        //Outer loop
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = n; j > i; j--) {
                System.err.print(" ");
            }
            //for first numbers
            for (int j = i; j >= 1; j--) {
                System.err.print(j);
            }
            //for second numbers
            for (int j = 2; j <= i; j++) {
                System.err.print(j);
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter any number to print the PALINDROMIC with number pattern.");
        int n = sc.nextInt();
        System.err.println();

        palindromicNumberPattern(n);

        sc.close();


    }
}
