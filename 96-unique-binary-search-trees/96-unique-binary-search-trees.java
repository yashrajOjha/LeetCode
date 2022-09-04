class Solution {
    public int func(int n, int dp[]){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans= 0;
        for(int i=1;i<=n;i++){
            ans+=func(i-1,dp)*func(n-i,dp);
            dp[n]=ans;
        }
        return dp[n];
    }
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n,dp);
    }
}