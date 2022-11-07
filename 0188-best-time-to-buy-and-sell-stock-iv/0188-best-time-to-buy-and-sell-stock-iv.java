class Solution {
    int dp[][];
    public int func(int[] prices, int ind, int trans, int k){
        if(ind==prices.length || trans==2*k) return 0;
        
        if(dp[ind][trans]!=-1) return dp[ind][trans];
        
        if(trans%2==0){ //we can buy because transaction is a combination of two actions and they have been performed
            dp[ind][trans] = Math.max(-prices[ind]+func(prices,ind+1,trans+1,k),0+func(prices,ind+1,trans,k));
        }else{
            dp[ind][trans] = Math.max(prices[ind]+func(prices,ind+1,trans+1,k),0+func(prices,ind+1,trans,k));
        }
        return dp[ind][trans];
    }
    public int maxProfit(int k, int[] prices) {
        dp = new int[prices.length][2*k]; //one transaction is combination of buy and sell and there by 2 actions in one transaction
        for(int rows[]:dp) Arrays.fill(rows,-1);
        return func(prices,0,0,k);
    }
}