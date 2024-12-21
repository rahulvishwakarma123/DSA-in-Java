import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.println("Enter any number to print the pattern.");
        int n = sc.nextInt();

        numberPyramidPattern(n);

        sc.close();
    }

    public static void numberPyramidPattern(int n){

        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            //for the numbers
            for (int j = 1; j <= i ; j++) {
                System.err.print(i + " ");
            }
            System.err.println();
        }

    }
}
