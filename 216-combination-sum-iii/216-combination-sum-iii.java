class Solution {
    public void func(int num, int n, int k, List<Integer> ds, List<List<Integer>> res){
        if(n==0 && ds.size()==k){
            res.add(new ArrayList<>(ds));
            return;
        }
        if(ds.size()==k) return;
        for(int i=num;i<=9;i++){
            ds.add(i);
            func(i+1,n-i,k,ds,res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        func(1,n,k,new ArrayList<Integer>(), res);
        return res;
    }
}