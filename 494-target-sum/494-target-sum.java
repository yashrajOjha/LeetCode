class Solution {
    public int func(int index, int nums[],int target, int dp[][]){
        // if(target==0) return 1;
        if(index==nums.length){
            if(target==0) return 1;
            else return 0;
        }
        if(dp[index][target+1001]!=-1) return dp[index][target+1001];
        int plus = func(index+1,nums,target+nums[index],dp);
        int neg = func(index+1,nums,target-nums[index],dp);
        return dp[index][target+1001]=plus+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int dp[][] = new int[nums.length][target+2009];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(0, nums,target,dp);
    }
}