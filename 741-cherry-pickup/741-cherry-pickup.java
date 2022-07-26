class Solution {
    public int func(int r1, int c1, int r2, int c2, int grid[][], int dp[][][][]){
        if(r1>= grid.length || r2>=grid.length || c1>=grid.length || c2>=grid.length || grid[r1][c1]==-1 || grid[r2][c2]==-1) return (int)Math.pow(-10,9);
        
        if(r1==grid.length-1 && c1==grid.length-1) return grid[r1][c1];
        
        if(dp[r1][c1][r2][c2]!=0) return dp[r1][c1][r2][c2];
        int cherry=0;
        if(r1==r2 && c1==c2){
            cherry+=grid[r1][c1]; //if they reach the same spot only one person can pick the cherry
        }else{
            cherry+=grid[r1][c1]+grid[r2][c2];
        }
        
        int vv = func(r1+1,c1,r2+1,c2,grid,dp);
        int hh = func(r1, c1+1,r2,c2+1,grid,dp);
        int vh = func(r1+1,c1,r2,c2+1,grid,dp);
        int hv = func(r1, c1+1,r2+1,c2,grid,dp);
        cherry+=Math.max(vv,Math.max(hh,Math.max(vh,hv)));
        return dp[r1][c1][r2][c2]=cherry;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int dp[][][][]= new int[n][n][n][n];
        return Math.max(func(0,0,0,0,grid,dp),0);
    }
}