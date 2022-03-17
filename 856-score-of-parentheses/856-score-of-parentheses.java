class Solution {
    public int scoreOfParentheses(String s) {
        int start=0,bal=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') bal++;
            else{
                bal--;
            }
            
            if(bal==0){
                ans+=findScore(s,start,i);
                start=i+1;
            }
        }
        return ans;
    }
    public int findScore(String str, int start, int end){
        if(end-start==1) return 1;
        else{
            return scoreOfParentheses(str.substring(start+1,end))*2;
        }
    }
}