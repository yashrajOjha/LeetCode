class Solution {
    public int maxProfit(int[] prices, int fee) {
        int ahead[] = new int[2];
        int curr[] = new int[2];
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    curr[buy] = Math.max(-prices[i]+ahead[0],0+ahead[1]);
                }else{
                    curr[buy] = Math.max(prices[i]-fee+ahead[1],0+ahead[0]);
                }
            }
            ahead=curr;
        }
        return ahead[1];
    }
}