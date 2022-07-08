class Solution {
    public void findSubset(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<Integer>(ds));
        for(int i=index; i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findSubset(i+1,nums, ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //how will you get the duplicates in side by side so we sort it
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0,nums, new ArrayList<Integer>(),ans);
        return ans;
    }
}