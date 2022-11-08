class Solution {
    int dp[][];
    public int LIS(int curr, int prev, int nums[]){
        if(curr==nums.length) return 0;
        
        if(dp[curr][prev+1]!=-1) return dp[curr][prev+1];
        
        int len = 0 + LIS(curr+1,prev,nums);
        if(prev==-1 || nums[curr]>nums[prev]){
            len = Math.max(len, 1+ LIS(curr+1,curr,nums));
        }
        return dp[curr][prev+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        dp = new int [nums.length][nums.length+1]; //storing curr and previous index values
        for(int row[]:dp) Arrays.fill(row,-1);
        return LIS(0,-1,nums);
    }
}
