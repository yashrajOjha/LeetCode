class Solution {
    public int func(int ind1, int ind2, String s, String t,int dp[][]){
        if(ind2<0) return 1;
        if(ind1<0) return 0;
        
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        
        if(s.charAt(ind1)==t.charAt(ind2)){
            return dp[ind1][ind2]=func(ind1-1,ind2-1,s,t,dp) + func(ind1-1,ind2,s,t,dp);
        }else{
            return dp[ind1][ind2]=func(ind1-1,ind2,s,t,dp);
        }
    }
    public int numDistinct(String s, String t) {
        int n=s.length(),m=t.length();
        int dp[][] = new int[n][m];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        return func(s.length()-1,t.length()-1,s,t,dp);
    }
}