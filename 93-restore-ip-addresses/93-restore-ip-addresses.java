class Solution {
    public void helper(String s, int i, int part, String ans, List<String> res){
        if(i==s.length() || part==4){
            if(s.length()==i && part==4){
                res.add(ans.substring(0,ans.length()-1));
            }
            return;
        }
        helper(s,i+1,part+1,ans+ s.charAt(i)+".",res);
        if(i+2<=s.length() && isValid(s.substring(i,i+2))){
            helper(s,i+2,part+1,ans+s.substring(i,i+2)+".",res);
        }
        if(i+3<=s.length() && isValid(s.substring(i,i+3))){
            helper(s,i+3,part+1,ans+s.substring(i,i+3)+".",res);   
        }
    }
    public boolean isValid(String str){
        if(str.charAt(0)=='0') return false;
        return Integer.valueOf(str)<=255;
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(s,0,0,"",res);
        return res;
    }
}