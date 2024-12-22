public class SpiralMatrix {
    public static void spiralMatrix(int[][] arr){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // for top
            for (int j = startCol; j < endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            //for right part
            for (int i = startRow; i < endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            //for bottom part
            for (int j = endCol; j > startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");                
            }
            // for left part
            for (int i = endRow; i > startRow ; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");                
            }
            startRow++;
            endCol--;
            endRow--;
            startCol++; 

        }
    }

    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        spiralMatrix(arr);
    }
}