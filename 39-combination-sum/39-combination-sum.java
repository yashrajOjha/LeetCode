class Solution {
    public void findCom(int index, int candidates[], int target, List<List<Integer>> res, List<Integer> inner){
        if(index==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(inner));
            }return;
        }
        if(candidates[index]<=target){
            inner.add(candidates[index]);
            findCom(index,candidates,target-candidates[index],res, inner);
            inner.remove(inner.size()-1);
        }
        findCom(index+1,candidates,target,res, inner);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates.length==0) return res;
        findCom(0,candidates,target,res,new ArrayList<Integer>());
        return res;
    }
}