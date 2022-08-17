class Solution{
    public int cutRod(int price[], int n) {
        //code here
        int dp[][] = new int[n][n+1];
        
        for(int i=0;i<=n;i++) dp[0][i] = i*price[0];
        
        for(int i=1;i<n;i++){
            for(int cut=0;cut<=n;cut++){
                int nottake = 0 + dp[i-1][cut];
                int take = Integer.MIN_VALUE;
                int cutI = i+1;
                if(cutI<=cut) take = price[i] + dp[i][cut-cutI];
                
                dp[i][cut] = Math.max(take,nottake);
            }
        }
        return dp[n-1][n];
    }
}
