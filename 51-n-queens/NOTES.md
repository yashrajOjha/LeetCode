class Solution {
    /*lets check if it is safe to fill up or not, if a queen can be placed at a position or not.
    We need to check for upper left diagonal (not right we havent yet placed a Q on the right), on the horizontal left, and lower left diagonal. */
    public boolean isSafe(int row, int col, char board[][]){
        int dRow = row;
        int dCol = col;
        //for upper diagonal
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
        col=dCol;
        row=dRow;
        //for moving horizontally left
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }
        col = dCol;
        row=dRow;
        //for lower diagonal
        while(row<board.length && col>=0){
            if(board[row][col]=='Q')return false;
            row++;
            col--;
        }
        return true;
    }
    public void solve(int col, char board[][], List<List<String>> res, int n){
        //the moment we reach n-1th index we reach the base case
        if(col==board.length){
            //store it in list of list
            res.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            //check if it is sage to place the Q
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                solve(col+1,board,res, n);
                board[row][col]='.'; //omit the Q this is a backtrack step
            }
        }
    }
    public List<String> construct(char board[][]){
        List<String> res = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        solve(0,board,res,n);
        return res;
    }
}
