class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix.length];
        for(int j=0;j<matrix.length;j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int down = matrix[i][j] + dp[i-1][j];
                
                int leftDiagonal= matrix[i][j];
                if(j-1>=0) leftDiagonal += dp[i-1][j-1];
                else leftDiagonal += (int)Math.pow(10,9);
            
                int rightDiagonal = matrix[i][j];
                if(j+1<matrix.length) rightDiagonal += dp[i-1][j+1];
                else rightDiagonal += (int)Math.pow(10,9);
                
                dp[i][j] = Math.min(down, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        int minVal = (int) Math.pow(10,9);
        for(int i=0;i<matrix.length;i++){
            minVal = Math.min(minVal, dp[matrix.length-1][i]);
        }
        return minVal;
    }
}