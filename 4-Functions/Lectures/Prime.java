import java.util.Scanner;

public class Prime {

    public static boolean prime(int n) {
        // Corner cases.
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not a prime
            }
        }
        
        return true; // No divisors found, it's a prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to find if it's prime or not:");
        int n = sc.nextInt();

        boolean isPrime = prime(n);

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
