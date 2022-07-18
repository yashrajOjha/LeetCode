class Solution {
    public void gP(int left, int right, String str, List<String> res){
        if(left==0 && right==0){
            res.add(str);
            return;
        }
        if(left>0){
            gP(left-1,right,str+"(",res);
        }
        if(right>0 && left<right){
            gP(left, right-1, str+")",res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        gP(n,n,"",res);
        return res;
    }
}