class Solution {
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length+1][2];
        dp[prices.length][1]=0;
        dp[prices.length][1]=0;
        for(int ind=prices.length-1;ind>=0;ind--)
        {
            for(int hold=0;hold<=1;hold++){
                int profit=0;
                if(hold==0){
                    int buy = -prices[ind] + dp[ind+1][1];
                    int notbuy = 0 + dp[ind+1][0];
                    profit = Math.max(buy, notbuy);
                }else{
                    int sell = prices[ind] + dp[ind+1][0];
                    int notsell = 0 + dp[ind+1][1];
                    profit = Math.max(sell,notsell);
                }
                dp[ind][hold]=profit;
        }
        }
        return dp[0][0];
    }
}