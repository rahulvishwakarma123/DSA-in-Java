public class Recursion {

    
    public static void DeNumber(int n){     //Print the number in the decresing order
        if (n==0) {
            return;
        }
        System.out.println(n);
        DeNumber(n-1);
    }

    
    public static void InNumber(int start){     //Print number in the increasing oreder.
        
        //first way.

        // {
        // if (start == end) {
        //     return;
        // }
        // System.out.println(n);
        // InNumber(start +1 , end);
        // }


        //Second way.
        if (start == 0) {
            return;
        }
        InNumber(start-1);
        System.out.println(start);
    }


    
    public static boolean isSorted(int arr[],int i){        // Check the array is sorted or not.
        //base condition
        if (i == arr.length-1) {
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }


    public static int fOccurrence(int arr[],int key,int index){     // find the first occurrence of an element of the array.  
        //base case
        if (index == arr.length) return -1;
        if  (arr[index] == key) return index;
        return fOccurrence(arr, key, index + 1);
    }

    public static int lOccurrence(int arr[], int key, int index){
        if(index == -1) return -1;
        if(arr[index] == key) return index;

        return lOccurrence(arr, key, (arr.length - 1) - (index + 1));
    }

    public static void main(String[] args) {        //main function
        // int n = 5;
        // InNumber(n); 

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr,0));
        
        int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(fOccurrence(arr, 5, 0));
        System.out.println(lOccurrence(arr, 5, 0));
        
    }
}