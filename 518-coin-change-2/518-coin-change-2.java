class Solution {
    public int func(int index, int target, int coins[], int dp[][]){
        if(index==0){
            if(target%coins[0]==0) return 1;
            else return 0;
        }
        
        if(dp[index][target]!=-1) return dp[index][target];
        
        int nT = func(index-1,target,coins,dp);
        int T = 0;
        if(coins[index]<=target) T = func(index,target-coins[index],coins,dp);
        
        return dp[index][target]=nT+T;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        
        return func(n-1,amount,coins,dp);
    }
}