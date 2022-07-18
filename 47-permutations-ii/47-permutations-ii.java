class Solution {
    public void perm(int nums[],boolean vis[],List<Integer> ds,List<List<Integer>> res){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue; // if the element is already visited
            if(i>0 && !vis[i-1] && nums[i]==nums[i-1]) continue;
            
            vis[i]=true;
            ds.add(nums[i]);
            perm(nums,vis,ds,res);
            ds.remove(ds.size()-1);
            vis[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        perm(nums,new boolean[nums.length],new ArrayList<Integer>(),res);
        return res;
    }
}