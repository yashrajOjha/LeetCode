```
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