class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max=1,curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]-1==nums[i-1]) curr++;
            else{
                max=Math.max(curr,max);
                curr=1;
            }
            }
        }
        return Math.max(curr, max);
    }
}