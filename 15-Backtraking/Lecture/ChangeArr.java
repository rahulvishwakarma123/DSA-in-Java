public class ChangeArr {
    public static void changeArr(int arr[], int index, int val){    // to change the array
        if (index == arr.length) {
            printArr(arr);
            return;
        }
    
        
        arr[index] = val;
        changeArr(arr, index+1, val+1);     //recursion
       
        arr[index] = val - 2;    //Backtraking
    }

    public static void printArr(int arr[]){     //to print the array
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 0);
        printArr(arr);
    }
}
