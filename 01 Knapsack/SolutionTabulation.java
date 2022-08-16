static int knapsack(int[] wt, int[] val, int n, int W) {
        int dp[][] = new int[n][W+1];
        for(int ind=wt[0];ind<=W;ind++){
            dp[0][ind] = val[0];
        }
        
        for(int index=1;index<n;index++){
            for(int w=0;w<=W;w++){
                int nS = 0+dp[index-1][w];
                int S = (int)Math.pow(-10,9);
                if(wt[index]<=w){
                    S = val[index]+dp[index-1][w-wt[index]];
                }
                dp[index][w] = Math.max(S,nS);
            }
        }
        return dp[n-1][W];
}
