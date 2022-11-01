class Solution {
    public int maxProfit(int[] prices) {
        int ahead[] = new int[2];
        int curr[] = new int[2];
        ahead[0]=ahead[1]=0;
        for(int ind=prices.length-1;ind>=0;ind--)
        {
            for(int hold=0;hold<=1;hold++){
                int profit=0;
                if(hold==0){
                    int buy = -prices[ind] + ahead[1];
                    int notbuy = 0 + ahead[0];
                    profit = Math.max(buy, notbuy);
                }else{
                    int sell = prices[ind] + ahead[0];
                    int notsell = 0 + ahead[1];
                    profit = Math.max(sell,notsell);
                }
                curr[hold]=profit;
        }
            ahead = curr;
        }
        return ahead[0];
    }
}