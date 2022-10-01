class Solution {
    public int func(String s, int index, int dp[]){
        if(index==s.length()) return 1;
        
        if(s.charAt(index)=='0') return 0;
        
        if(dp[index]!=-1) return dp[index];
        int dig1 = func(s, index+1,dp);
        int dig2 = 0;
        if (index<s.length()-1 && Integer.valueOf(s.substring(index,index+2))<=26){
            dig2 = func(s, index+2,dp);
        }
        return dp[index]=dig1+dig2;
        
    }
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return func(s,0,dp);
    }
}