class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int dp[][] = new int[N][W+1];
        for(int wei=0;wei<=W;wei++) dp[0][wei] = (wei/wt[0])*val[0];
        
        for(int i=1;i<N;i++){
            for(int wei=0;wei<=W;wei++){
                int nottake = 0 + dp[i-1][wei];
                int take = (int)Math.pow(-10,9);
                if(wt[i]<=wei) take = val[i] + dp[i][wei-wt[i]];
                
                dp[i][wei] = Math.max(nottake,take);
            }
        }
        return dp[N-1][W];
    }
}
