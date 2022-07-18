class Solution {
    public void perm(int nums[], int map[], List<Integer> ds, HashSet<List<Integer>> res){
        if(ds.size()==nums.length){
            res.add(new ArrayList<Integer>(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(map[i]!=1){
                map[i]=1;
                ds.add(nums[i]);
                perm(nums,map,ds,res);
                ds.remove(ds.size()-1);
                map[i]=0;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> res = new HashSet<>(); 
        int map[] = new int[nums.length];
        perm(nums,map,new ArrayList<Integer>(),res);
        for(List<Integer> ele:res){
            ans.add(ele);
        }
        return ans;
    }
}