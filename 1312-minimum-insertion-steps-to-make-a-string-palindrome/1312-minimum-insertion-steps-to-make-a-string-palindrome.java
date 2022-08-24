class Solution {
    public int minInsertions(String str1) {
        String str2 = new StringBuilder(str1).reverse().toString();
        int n = str1.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++)dp[i][0]=0;
        for(int j=0;j<=n;j++)dp[0][j]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else{
                    dp[i][j] = 0 + Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return (str1.length()-dp[n][n]);
    }
}