class Solution {
    public int solve(int grid[][], int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]!=1) return 0;
        grid[row][col]=2;
        return 1 + solve(grid, row+1, col) + solve(grid, row, col-1) + solve(grid, row, col+1) + solve(grid, row-1, col);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                maxArea = Math.max(maxArea, solve(grid,i,j));
            }
        }
        return maxArea;
    }
}