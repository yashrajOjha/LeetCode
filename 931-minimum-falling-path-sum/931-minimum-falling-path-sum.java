class Solution {
    public int func(int matrix[][], int row, int col, int dp[][]){
        if(col>=matrix.length ||col<0) return (int)Math.pow(10,9);
        if(row==matrix.length-1) return matrix[row][col];
        
        if(dp[row][col]!=-1) return dp[row][col];
        
        int down = matrix[row][col] + func(matrix,row+1,col,dp);
        int dr = matrix[row][col] + func(matrix,row+1,col+1,dp);
        int dl = matrix[row][col] + func(matrix,row+1,col-1,dp);
        
        return dp[row][col]=Math.min(down, Math.min(dr, dl));
    }
    public int minFallingPathSum(int[][] matrix) {
        int minval = Integer.MAX_VALUE;
        int dp[][]= new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int j=0;j<matrix.length;j++){
            minval = Math.min(minval, func(matrix,0,j,dp));
        }
        return minval;
    }
}