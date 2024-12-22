public class NQueens {
    public static void nQueen(char chessBoard[][],int row){     //  nQueens problem
        if (row == chessBoard.length) {
            // count++;
            printBoard(chessBoard);
            // return true;
            return ;
        }
        //column loop
        for (int j = 0; j < chessBoard.length; j++) {
            if(isSafe(chessBoard, row, j)){
                    chessBoard[row][j] = 'Q';
                    nQueen(chessBoard, row+1);// recursion
                    chessBoard[row][j] = 'x';   // backtraking
            }
                
        }
    }
    // -------------------------------------------------------------------------------------------
    public static boolean isSafe(char chessBoard[][], int row, int col){
        // vertically up
        for (int i = row-1; i >= 0; i--) {
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }
        //diagonaly left up
        for (int i = row-1,j=col-1; i >=0 && j>=0; i--,j--) {
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        //diagonaly right up
        for (int i = row-1,j=col+1; i >=0 && j<=chessBoard.length-1; i--,j++) {
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }

    public static void printBoard(char arr[][]){             // to print 2D array
        System.out.println("-------chessBoard------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //for initialization of the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
    }
}
