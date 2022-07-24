class Solution {
    // public int func(int i,int j,int dp[][],int grid[][]){
    //     if(i==0 && j==0) return grid[i][j];
    //     if(i<0 || j<0) return Integer.MAX_VALUE;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     return dp[i][j] = grid[i][j] + Math.min(func(i-1,j,dp,grid),func(i,j-1,dp,grid));
    // }
    public int minPathSum(int[][] matrix) {
        int m = matrix.length, n=matrix[0].length;
    int dp[][]=new int[m][n];
    
    for(int i=0; i<m ; i++){
        for(int j=0; j<n; j++){
            if(i==0 && j==0) dp[i][j] = matrix[i][j];
            else{
                
                int up = matrix[i][j];
                if(i>0) up += dp[i-1][j];
                else up += (int)Math.pow(10,9);
                
                int left = matrix[i][j];
                if(j>0) left+=dp[i][j-1];
                else left += (int)Math.pow(10,9);
                
                dp[i][j] = Math.min(up,left);
            }
        }
    }
    
    return dp[m-1][n-1];

    }
}