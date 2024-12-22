import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number to find the factorial.");
        int n = sc.nextInt();

        System.err.println(factorial(n));

        sc.close();
    }
}