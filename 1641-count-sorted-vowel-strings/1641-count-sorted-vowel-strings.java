class Solution {
    public int func(int i, int n,int dp[][]){
        if(n==0) return 1;
        if(i<0) return 0; //considering a vowel string has just 5 letters
        
        if(dp[i][n]!=-1) return dp[i][n];
        
        int pick = func(i,n-1,dp);
        int notpick = func(i-1,n,dp);
        
        return dp[i][n]=pick+notpick;
    }
    public int countVowelStrings(int n) {
        int dp[][] = new int[5][n+1];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        return func(4,n,dp);
    }
}