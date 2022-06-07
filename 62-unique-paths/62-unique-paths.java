class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }else{
                    int up=0,left=0;
                    if(i>0){
                        up = dp[i-1][j];
                    }
                    if(j>0){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}