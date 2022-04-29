class Solution {
    private void recurPerm(int nums[], List<Integer> ds, List<List<Integer>> ans, boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true; //mark the element as truw
                ds.add(nums[i]); //add it to data structure
                recurPerm(nums,ds,ans,freq); //go down the recursive tree
                ds.remove(ds.size()-1); //remove from the data structure
                freq[i]=false; //unmark the element
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> ans = new ArrayList<>();
     List<Integer> ds =new ArrayList<>();
     boolean freq[] = new boolean[nums.length];
     recurPerm(nums, ds, ans,freq);
     return ans;
    }
}