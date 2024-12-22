import java.util.Scanner;

public class PrimeInRange {

    public static boolean prime(int n){
        
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%2==0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){

        for (int i = 1; i <= n; i++) {
            boolean isPrime = prime(i);
            if (isPrime) {
                System.err.print(i + "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the number to find the primes in range of this number.");
        int n = sc.nextInt();

        primeInRange(n);

        sc.close();
    }
}