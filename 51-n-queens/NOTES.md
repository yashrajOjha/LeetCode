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
```