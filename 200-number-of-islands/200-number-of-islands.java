class Solution {
    public void func(char [][] grid, int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0') return ;
        
        //marking visited grid 
        grid[row][col]='0';
        
        //moving dlru
        func(grid,row+1,col);
        func(grid,row,col-1);
        func(grid,row,col+1);
        func(grid,row-1,col);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length; int m = grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    func(grid,i,j);
                }
            }
        }
        return count;
    }
}