public class DiagonalSum {
    
    public static int diagonalSum(int[][] arr){
        int sum = 0;
        boolean same = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i+j == arr.length - 1 ) {
                    if (i == j && i+j == arr.length - 1 && !same) {
                        sum += arr[i][j];
                        same = true;
                    }else{
                        sum += arr[i][j];
                    }
                }
            }
        }  
        return sum;
    }
    // this is optimized diagonal sum code.
    public static int opDiagonalSum(int[][] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != n-i-1) {
                sum += arr[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        // int arr2[][] = { {1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};


        System.out.println("The diagonal sum of the array is: " + opDiagonalSum(arr));
        
    }
}
