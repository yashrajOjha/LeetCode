class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int n:nums){
            int val = Math.abs(n);
            if(nums[val-1]<0) res.add(val);
            else{
                nums[val-1] = -nums[val-1];
            }
        }
        return res;
    }
}