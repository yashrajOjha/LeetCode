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
        // int root = (int)Math.sqrt(n);
        dp = new int[n+1];
        Arrays.fill(dp,(int)Math.pow(10,9));
        dp[0]=0; //when val is 0 you can make a sum with least squares
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                int sq=j*j;
                if(i-sq>=0){
                    dp[i] = Math.min(dp[i],1+dp[i-sq]);
                }
            }
        }
        return dp[n];
        // return func(n,root);
    }
}