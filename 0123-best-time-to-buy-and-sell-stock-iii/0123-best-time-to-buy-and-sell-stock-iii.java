class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][] = new int[n+1][2][3];
        //base case of transaction 0
        // for(int ind=0;ind<n;ind++){
        //     for(int buy=0;buy<=1;buy++){
        //         dp[ind][buy][0]=0;
        //     }
        // }
        // //base case where end of prices is reached
        // for(int buy=0;buy<=1;buy++){
        //     for(int trans=0;trans<=2;trans++){
        //         dp[prices.length-1][buy][trans]=0;
        //     }
        // }
        //tabulation
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                for(int trans=1;trans<=2;trans++){
                    if(buy==1){
                       
                        dp[ind][buy][trans] = Math.max(-prices[ind] +  dp[ind+1][0][trans],dp[ind+1][1][trans]);
                    }else{
                        dp[ind][buy][trans]= Math.max(prices[ind] + dp[ind+1][1][trans-1],dp[ind+1][0][trans]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }
}