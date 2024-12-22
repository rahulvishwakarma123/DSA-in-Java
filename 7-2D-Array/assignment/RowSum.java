public class RowSum {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int row = 1;
        System.out.println("Sum of row "+ row + ": " + calSum(array, row));
        
    }

    public static int calSum(int arr[][], int row){
        int sum = 0;
        for(int i = 0; i < arr[row].length; i++){
            sum += arr[row][i];
        }
        return sum;
    }
        
}
