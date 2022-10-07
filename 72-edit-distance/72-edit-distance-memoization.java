class Solution {
    public int func(int i, int j, String word1, String word2,int dp[][]){
        if(i<0) return j+1;
        if(j<0) return i+1; 
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(word1.charAt(i)==word2.charAt(j)) return dp[i][j]=0+func(i-1,j-1,word1,word2,dp);
        return dp[i][j]=Math.min(
            1 + func(i,j-1,word1, word2,dp), //insertion
            Math.min(
                1 + func(i-1,j,word1,word2,dp), //deletion
                1 + func(i-1,j-1,word1, word2,dp) //replace
            )
        );
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][]= new int[n][m];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        return func(n-1,m-1,word1,word2,dp);
    }
}
