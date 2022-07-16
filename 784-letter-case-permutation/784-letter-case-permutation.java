class Solution {
    public void helper(int index, List<String> res, char s[]){
        if(index==s.length){
            res.add(new String(s));
            return;
        }
        if(Character.isLetter(s[index])){
            s[index]=Character.toUpperCase(s[index]);
            helper(index+1,res,s);
            s[index]=Character.toLowerCase(s[index]);
            helper(index+1,res,s);
        }
        else{
            helper(index+1,res,s);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        helper(0,res,s.toCharArray());
        return res;
    }
}