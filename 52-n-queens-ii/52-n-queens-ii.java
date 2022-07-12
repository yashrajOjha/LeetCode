class Solution {
        public void solve(int col, char board[][], List<List<String>> res, int leftRow[], int leftDiagonal[], int rigthDiagonal[]){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftRow[row]==0 &&
            leftDiagonal[row+col]==0 &&
            rigthDiagonal[board.length-1+col-row]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                leftDiagonal[row+col]=1;
                rigthDiagonal[board.length-1+col-row]=1;
                solve(col+1,board, res, leftRow, leftDiagonal, rigthDiagonal);
                board[row][col]='.';
                leftRow[row]=0;
                leftDiagonal[row+col]=0;
                rigthDiagonal[board.length-1+col-row]=0;
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
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int leftRow[] = new int[n];
        int leftDiagonal[] = new int[2*n-1];
        int rigthDiagonal[] = new int[2*n-1];
        solve(0,board,res,leftRow,leftDiagonal,rigthDiagonal);
        return res.size();
    }
}