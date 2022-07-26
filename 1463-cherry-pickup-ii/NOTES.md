**Memoization**
```
class Solution {
public int func(int grid[][], int row, int col1, int col2, int dp[][][]){
if(col1<0 || col1>=grid[0].length || col2<0 || col2>=grid[0].length) return (int)Math.pow(-10,9);
if(row==grid.length-1){
if(col1==col2) return grid[row][col1];
else return grid[row][col1]+grid[row][col2];
}
if(dp[row][col1][col2]!=-1) return dp[row][col1][col2];
// int maxVal = (int)Math.pow(-10,9);
int ans = 0;
for(int dj1=-1;dj1<=1;dj1++){
for(int dj2=-1;dj2<=1;dj2++){
if(col1==col2) ans = Math.max(ans, grid[row][col1]+func(grid,row+1,col1+dj1,col2+dj2,dp));
else{
ans = Math.max(ans, grid[row][col1]+grid[row][col2]+func(grid,row+1,col1+dj1,col2+dj2,dp));
// maxVal = Math.max(maxVal,ans);
}
}
}
return dp[row][col1][col2]=ans;
}
public int cherryPickup(int[][] grid) {
int m = grid.length;
int n= grid[0].length;
int dp[][][] = new int[m][n][n];
for(int[][] rowOne : dp){
for(int[] rowTwo : rowOne){
Arrays.fill(rowTwo, -1);
}
}
return func(grid, 0,0,n-1,dp);
}
}
```