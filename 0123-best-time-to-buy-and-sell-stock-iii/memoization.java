class Solution {
    int dp[][][];
    public int func(int[] prices, int ind, int canbuy, int trans){
        if(ind==prices.length) return 0;
        if(trans==0) return 0;
        
        if(dp[ind][canbuy][trans]!=-1) return dp[ind][canbuy][trans];
        int profit=0;
        if(canbuy==1){
            int buy=-prices[ind] + func(prices, ind+1,0,trans);
            int notbuy = 0 + func(prices,ind+1,1,trans);
            profit = Math.max(buy,notbuy);
        }else{
           int sell = prices[ind] + func(prices,ind+1,1,trans-1); //after selling one transaction is complete
           int dontsell = 0 + func(prices,ind+1,0,trans);
            profit = Math.max(sell,dontsell);
        }
        return dp[ind][canbuy][trans]=profit;
    }
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2][3];
        for(int rows[][]:dp){
            for(int row[]:rows) Arrays.fill(row,-1);
        }
        return func(prices,0,1,2); //passing array, index to start from, can buy stock or no, number of transactions.
    }
}
