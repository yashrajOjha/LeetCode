class Solution {
    public void subseq(int index, int[] nums, List<Integer> arr, List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        arr.add(nums[index]);
        subseq(index+1, nums, arr, res);
        // res.add(arr);
        arr.remove(arr.size()-1);
        subseq(index+1, nums, arr,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        Arrays.sort(nums);
        res.add(new ArrayList<>());
        subseq(0,nums,arr,res);
        List<List<Integer>> newAns = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(List<Integer> curr : res){
            set.add(curr);
        }
        for(List<Integer> curr : set){
            newAns.add(curr);
        }
        return newAns;
    }
}