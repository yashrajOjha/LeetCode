class Solution {
    public int func(int i, int j, int dp[][],int arr[][]){
        if(i>=0 && j>=0 && arr[i][j]==1) return 0;
        if(i==0 & j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] = func(i-1,j,dp,arr) + func(i,j-1,dp,arr);
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return func(m-1,n-1,dp,arr);
    }
}