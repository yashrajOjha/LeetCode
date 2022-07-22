class Solution {
    // public int func(int i, int j, int dp[][],int arr[][]){
    //     if(i>=0 && j>=0 && arr[i][j]==1) return 0;
    //     if(i==0 & j==0) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     return dp[i][j] = func(i-1,j,dp,arr) + func(i,j-1,dp,arr);
    // }
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        // dp[0][0] =1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) dp[i][j]=0;
                else if(i==0 && j==0) dp[i][j] =1;
                else{
                    int left =0,up=0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up+left;
                }
            }
        }
        // return func(m-1,n-1,dp,arr);
        return dp[m-1][n-1];
    }
}