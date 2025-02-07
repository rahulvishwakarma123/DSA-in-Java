public class Q1 {
    // For a given integer array of size N. You have to find all the occurrences (indices) of a given element (key) and print them.
    public static void rec(int[] arr, int key, int index){
        if (index >= arr.length) {
            return;
        }
        if (key == arr[index]) {
            System.out.print(index + " ");
        }
        rec(arr, key, index + 1);
    }
    public static void main(String[] args){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        rec(arr, key, 0);
        
    }
}
