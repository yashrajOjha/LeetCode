class Solution {
    public int func(int index, int nums[], int dp[]){
        if(index==0)return nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = nums[index] + func(index-2,nums,dp);
        int notpick = 0 + func(index-1,nums,dp);
        return dp[index] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return func(nums.length-1,nums,dp);
    }
}