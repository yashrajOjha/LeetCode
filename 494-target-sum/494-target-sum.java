class Solution {
    public int func(int index, int nums[],int target){
        // if(target==0) return 1;
        if(index==nums.length){
            if(target==0) return 1;
            else return 0;
        }
        // if(target<0) return 0;
        // System.out.println(plus);
        int plus = func(index+1,nums,target+nums[index]);
        // System.out.println(plus);
        int neg = func(index+1,nums,target-nums[index]);
        // System.out.println(neg);
        return plus+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return func(0, nums,target);
    }
}