class Solution {
    int dp[][];
    public int findP(int ind, int hold, int prices[]){
    if(ind==prices.length) return 0;
        
    if(dp[ind][hold]!=-1) return dp[ind][hold];
    int profit = 0;
        
    if(hold==0){
        int buy = -prices[ind] + findP(ind+1,1,prices);
        int notbuy = 0 + findP(ind+1,0,prices);
        profit = Math.max(buy, notbuy);
    }else{
        int sell = prices[ind] + findP(ind+1,0,prices);
        int notsell = 0 + findP(ind+1,1,prices);
        profit = Math.max(sell,notsell);
    }
        return dp[ind][hold]=profit;
    }
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        return findP(0,0,prices);
    }
}
