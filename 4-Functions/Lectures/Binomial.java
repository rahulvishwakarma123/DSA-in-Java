import java.util.Scanner;

public class Binomial {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the value of n to find the binomial coefficient.");
        int n = sc.nextInt();
        System.err.println("Enter the value of r to find the binomial coefficient.");
        int r = sc.nextInt();

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomial = fact_n/(fact_r*fact_nmr);

        System.err.println(binomial);

        sc.close();
    }
}
