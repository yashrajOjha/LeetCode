class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int tar=0;tar<=amount;tar++) dp[0][tar] = (tar%coins[0]==0)?1:0;
        
        for(int i=1;i<n;i++){
            for(int tar=0;tar<=amount;tar++){
                int nT = dp[i-1][tar];
                int T = 0;
                if(coins[i]<=tar) T = dp[i][tar-coins[i]];
                
                dp[i][tar]=T+nT;
            }
        }
        return dp[n-1][amount];
    }
}