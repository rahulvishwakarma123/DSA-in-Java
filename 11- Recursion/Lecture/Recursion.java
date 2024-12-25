public class Recursion {

    //Print the number in the decresing order
    public static void DeNumber(int n){     
        if (n==0) {
            return;
        }
        System.out.println(n);
        DeNumber(n-1);
    }

    //Print number in the increasing oreder.
    public static void InNumber(int start){     
        //base case.
        if (start == 0) {
            return;
        }
        InNumber(start-1);
        System.out.println(start);
    }

    // Calculate the factorial of any number.
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int fact =  n * factorial(n-1);
        return fact;
    }

    //Print the sum of the natural numbres
    public static int naturalSum(int n){
        // Base case
        if(n == 1) return 1;
        int sum = n + naturalSum(n-1);
        return sum;
    }

    // Find the fabonacci number.
    public static int fabonacci(int n){
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        int fab = fabonacci(n-1) + fabonacci(n-2);
        return fab;
    }

    // Function to calculate the power of the number
    public static int power(int number,int power){
        if (power == 0) {
            return 1;
        }

        int ans = number * power(number, power-1);
        return ans;
    }

    // Optimized function for calculating the power of the number.
public static int optimizedPow(int number, int power) {
    if (power == 0) {
        return 1;
    }

    int halfPow = optimizedPow(number, power / 2);
    int halfPowSqr = halfPow * halfPow;

    // if power is odd
    if (power % 2 == 1) {
        halfPowSqr *= number;
    }

    return halfPowSqr;
}
    // Check the array is sorted or not.
    public static boolean isSorted(int arr[],int i){
        //base condition
        if (i == arr.length-1) {
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    // find the first occurrence of an element of the array.
    public static int fOccurrence(int arr[],int key,int index){       
        //base case
        if (index == arr.length) return -1;
        if  (arr[index] == key) return index;
        return fOccurrence(arr, key, index + 1);
    }

    // Function to find the last occurrence of the element.
    public static int lOccurrence(int arr[], int key, int index){
        if(index < 0 ) return -1;
        if(arr[index] == key) return index;

        int idx = lOccurrence(arr, key, index - 1);
        return idx;
    }   





    public static void main(String[] args) {        //main function
       
        // Function calls
        DeNumber(5);
        InNumber(5);
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of first 5 natural numbers: " + naturalSum(5));
        System.out.println("5th Fibonacci number: " + fabonacci(5));
        System.out.println("2 raised to the power 3: " + power(2, 3));
        System.out.println("Optimized 2 raised to the power 3: " + optimizedPow(2, 3));
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array is sorted: " + isSorted(arr, 0));
        System.out.println("First occurrence of 3: " + fOccurrence(arr, 3, 0));
        System.out.println("Last occurrence of 3: " + lOccurrence(arr, 3, arr.length - 1));
        
        
    }
}