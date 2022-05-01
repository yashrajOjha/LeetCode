class Solution {
    public String helper(String str){
        StringBuilder s = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch!='#'){
                s.append(ch);
            }else if(s.length()!=0){
                s.deleteCharAt(s.length()-1);
            }
        }
        return s.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
}