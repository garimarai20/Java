public class BackTracking3 {

    public static void nQueens(char board[][], int row){
        //base 
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);//function call
            board[row][j]='.';//  backtracking step
        }
    }
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char [n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0 );

    }
}
