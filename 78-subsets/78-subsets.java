class Solution {
    public void subseq(int index,int nums[],List<Integer> arr, List<List<Integer>> res){
        if(index>=nums.length){
            return;
        }
        arr.add(nums[index]);
        subseq(index+1,nums, arr, res);
        res.add(new ArrayList<>(arr));
        arr.remove(arr.size()-1);
        subseq(index+1,nums, arr, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        res.add(arr); //empty set;
        subseq(0, nums, arr, res);
        return res;
    }
}