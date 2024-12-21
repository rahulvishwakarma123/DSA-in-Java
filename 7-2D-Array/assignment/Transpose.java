public class Transpose {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };
        printArray(array);
        System.out.println("Transpose of the array is: ");
        
        transpose(array);
    }

    public static void transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] newArr = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        printArray(newArr);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}