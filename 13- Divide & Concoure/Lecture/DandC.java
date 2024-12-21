public class DandC {


    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if (si>=ei) {
            return;
        }
        //kaam
        int mid = si + (ei - si) /2;    //(si + ei)/2
        mergeSort(arr, si, mid);    //left part
        mergeSort(arr, mid + 1, ei);    //right part
        merge(arr, si, ei, mid);
    }
    

    //Auxilary function
    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[(ei - si + 1)];
        int i = si;     //iterator for the left array
        int j = mid + 1;     // iterator for the right array
        int k = 0;      // iterator for the temp array

        // compairing, shorting and saving into the temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }


        //copy the elements of the temp array into the arignal
        for ( k = 0, i = si; k < temp.length; i++, k++ ) {
            arr[i] = temp[k];
        }

    }

    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length - 1);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
    
    
}