public class StaircaseSearch {
    public static boolean stairCaseSearch(int arr[][],int key){
        int row = 0;
        int col = arr.length-1;
        while(row <= arr.length - 1 && col >= 0){
            // key found.
            if (arr[row][col] == key) {
                System.out.println("key is found at (" + row +"," + col + ")");
                return true;
            }
            if (key < arr[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        
        System.out.println(stairCaseSearch(arr,33));
        
    }
}
