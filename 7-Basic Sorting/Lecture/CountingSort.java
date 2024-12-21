public class CountingSort {
        public static void countingSort(int[] arr){
            int largest = Integer.MIN_VALUE;
            // To find the largest element in the arr.
            for (int i = 0; i < arr.length; i++) {
                largest = Math.max(largest, arr[i]);
            }
            // counting the frequency of the numbers of the arr.
            int count[] = new int[largest+1];
            for (int i = 0; i < arr.length; i++) {
                int elm = arr[i];
                count[elm]++;
            }
            
            int j = 0;  //iterator for arr
            
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }

            printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");            
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr); 
    }
}
