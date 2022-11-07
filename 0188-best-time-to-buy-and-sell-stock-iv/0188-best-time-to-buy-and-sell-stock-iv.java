class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[][][] = new int[prices.length+1][2][k+1];
        //base case where when k transactions are up the profit is 0
        //when the index is on the last day, we cannot get profit
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int trans=1;trans<=k;trans++){
                    if(buy==1){
                        dp[i][buy][trans] = Math.max(-prices[i]+dp[i+1][0][trans], 0 + dp[i+1][1][trans]);
                    }else{
                        dp[i][buy][trans] = Math.max(prices[i] + dp[i+1][1][trans-1],0 + dp[i+1][0][trans]);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
}