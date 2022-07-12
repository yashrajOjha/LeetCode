class Solution {
    public void solve(int col, char board[][], List<List<String>> res, int n, int leftRow[], int leftDiagonal[], int rightDiagonal[]){
        //the moment we reach n-1th index we reach the base case
        if(col==board.length){
            //store it in list of list
            res.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            //check if it is sage to place the Q
            if(leftRow[row]==0 && leftDiagonal[row+col]==0 && rightDiagonal[n-1+col-row]==0){
                board[row][col] = 'Q';
                leftRow[row]=1;
                leftDiagonal[row+col]=1;
                rightDiagonal[n-1+col-row]=1;
                solve(col+1,board,res, n,leftRow, leftDiagonal, rightDiagonal);
                board[row][col]='.'; //omit the Q this is a backtrack step
                leftRow[row]=0;
                leftDiagonal[row+col]=0;
                rightDiagonal[n-1+col-row]=0;
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
        int leftRow[] = new int[n];
        int leftDiagonal[] = new int[2*n-1];
        int rightDiagonal[] = new int[2*n-1];
        List<List<String>> res = new ArrayList<>();
        solve(0,board,res,n,leftRow,leftDiagonal,rightDiagonal);
        return res;
    }
}