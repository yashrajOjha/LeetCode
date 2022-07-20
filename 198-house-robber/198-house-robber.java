class Solution {
    // public int func(int index, int nums[], int dp[]){
    //     if(index==0)return nums[index];
    //     if(index<0) return 0;
    //     if(dp[index]!=-1) return dp[index];
    //     int pick = nums[index] + func(index-2,nums,dp);
    //     int notpick = 0 + func(index-1,nums,dp);
    //     return dp[index] = Math.max(pick, notpick);
    // }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        // return func(nums.length-1,nums,dp);
        dp[0] = nums[0];
        int neg = 0;
        for(int i=1;i<nums.length;i++){
            int pick = nums[i] + ((i>1)?dp[i-2]:0);
            int notpick = 0 + dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        return dp[nums.length-1];
    }
}