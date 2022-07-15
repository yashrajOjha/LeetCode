class Solution {
    public boolean palindrome(String s, int left, int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public void pp(String s, int index, List<String> ans, List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(palindrome(s,index, i)){
                ans.add(s.substring(index, i+1));
                pp(s,i+1, ans, res);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        pp(s, 0, new ArrayList<>(), res);
        return res;
    }
}