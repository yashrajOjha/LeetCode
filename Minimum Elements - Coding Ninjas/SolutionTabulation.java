class Solution{

	public int minCoins(int coins[], int M, int T) 
	{ 
	    // Your code goes here
	    int dp[][] = new int[M][T+1];
	    for(int i=0;i<=T;i++){
	        if(i%coins[0]==0) dp[0][i] = i/coins[0];
	        else dp[0][i]=(int)Math.pow(10,9);
	    }
	    for(int i=1;i<M;i++){
	        for(int tar=0;tar<=T;tar++){
	            int nottake =0+dp[i-1][tar];
	            int take = (int)Math.pow(10,9);
	            if(coins[i]<=tar) take = 1+dp[i][tar-coins[i]];
	            dp[i][tar] = Math.min(take, nottake);
	        }
	    }
	    int ans = dp[M-1][T];
	    ans = (ans>=(int)Math.pow(10,9))?-1:ans;
	    return ans;
	} 
