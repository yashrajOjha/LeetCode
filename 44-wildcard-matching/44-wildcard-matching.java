class Solution {
    Boolean dp[][];
    public boolean func(int i, int j, String s, String p){
        if(i<0 && j<0) return true; //when both the strings are exhausted
        if(j<0 && i>=0) return false; //when there are no characters in pattern but there are characters in str
        if(i<0 && j>=0){ //when there are no characters in str but there are characters in pattern
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }
        
        if(dp[i][j] != null) return dp[i][j];
        
        //when either both the characters in the strings are a match or we have the luxury of ? which skips on character match
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j]=func(i-1,j-1,s,p);
        }
        //when there is a * we have two choices, either to not consider the * (which will be useful when the characters match after * is skipped) or to consider the * and move to the previous character in the string, and consider the current unmatched character a part of the *
        if(p.charAt(j)=='*'){
            return dp[i][j]=func(i-1,j,s,p) || func(i,j-1,s,p); 
        }
        return false; //when there is no character match at all 
    }
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        dp = new Boolean[n][m];
        return func(n-1, m-1,s,p);
    }
}