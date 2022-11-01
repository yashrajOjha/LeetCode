class Solution {
    public int findCol(int row, int col, int grid[][]){
        if(row==grid.length) return col; //reached the last row and returning col number.
        if(col+1<grid[0].length && grid[row][col]==1 && grid[row][col+1]==1){
            return findCol(row+1,col+1,grid);
        }
        if(col-1>=0 && grid[row][col]==-1 && grid[row][col-1]==-1){
            return findCol(row+1,col-1,grid);
        }
        return -1;
    }
    public int[] findBall(int[][] grid) {
        int val[] = new int[grid[0].length];
        for(int col=0;col<grid[0].length;col++){
            val[col] = findCol(0,col,grid);
        }
        return val;
    }
}