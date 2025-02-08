public class SortedRotatedArraySearch {
    // sorted and rotated array with distinct number ( in acsending order). It is
    // rotated at the pivot point. Find out the index of the given element.
    public static int search(int[] arr, int si, int ei, int target) {
        if (si > ei) { // Base case
            return -1;
        }
        // Find mid
        int mid = si + (ei - si) / 2;

        // target found
        if (arr[mid] == target) {
            return mid;
        }

        // Mid on L1
        if (arr[si] <= arr[mid]) {
             // Targer lies of left part
             if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, si, mid-1, target);
             }
            // Targer lies of right part
            else{
                return search(arr, mid + 1, ei, target);
            }
        }
        // Mid on L2
        else{
            // Targer lies of left part
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, mid + 1, ei, target);
            }
            // Targer lies of right part
            else{
                return search(arr, si, mid - 1, target);
            }
        }  
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, 0, arr.length - 1, target));      
    }
}
