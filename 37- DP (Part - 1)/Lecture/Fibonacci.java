public class Fibonacci {

    
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n+1];
        System.out.println(fibonacci(n, arr));
    }
    public static int fibonacci(int n, int[] arr) {
        if (n == 1 || n == 2) {
            return 1; //  Return 1 for the first two Fibonacci numbers
        }
        if (arr[n] != 0) { //  Check if the current Fibonacci number is already computed
            return arr[n]; //  Return the computed Fibonacci number
        }
        arr[n] = fibonacci(n-1, arr) + fibonacci(n-2, arr);
        return arr[n];
    }
}