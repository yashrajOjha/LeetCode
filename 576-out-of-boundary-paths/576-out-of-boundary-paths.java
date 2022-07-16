class Solution {
    
    public int mod = (int)1e9 + 7;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] dp = new long[m][n][maxMove + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= maxMove; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return (int)helper(m, n, maxMove, startRow, startColumn, dp) % mod;
    }
    
    private long helper(int m, int n, int maxMove, int startRow, int startColumn, long[][][] dp) {
        if (maxMove < 0) {
            return 0;
        }
        if (startRow < 0 || startColumn < 0 || startRow >= m || startColumn >=n ) {
            return 1;
        }
        
        if (dp[startRow][startColumn][maxMove] != -1) {
            return dp[startRow][startColumn][maxMove];
        }
        
        long up = helper(m, n, maxMove - 1, startRow - 1, startColumn, dp);
        long right = helper(m, n, maxMove - 1, startRow, startColumn + 1, dp);
        long down = helper(m, n, maxMove - 1, startRow + 1, startColumn, dp);
        long left = helper(m, n, maxMove - 1, startRow, startColumn - 1, dp);
        
        long ans = (up + right + down + left) % mod;
        
        return dp[startRow][startColumn][maxMove] = ans % mod;
    }
}