public class QuikSort {
    public static void quikSort(int[] arr, int si, int ei){
        if (si >= ei) { // Base case
            return;
        }
        int pIndex = partition(arr, si, ei);
        partition(arr, si, pIndex-1);   // Left part
        partition(arr, pIndex + 1 , ei); // Right part.
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;  // To make for the elements smaller than pivot.
        for (int j = si; j < ei; j++) {
            if (arr[j] <=  pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        quikSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
