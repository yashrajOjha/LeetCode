class Solution {
    int dp[];
    public int func(int val, int root){
        if(val==0) return 0;
        
        if(dp[val]!=-1) return dp[val];
        int min=val;
        for(int i=root;i>=1;i--){
            int sq = (int)Math.pow(i,2);
            if(sq<=val) min = Math.min(min,1 + func(val-sq,root));
        }
        return dp[val]=min;
    }
    public int numSquares(int n) {
        int root = (int)Math.sqrt(n);
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n,root);
    }
}