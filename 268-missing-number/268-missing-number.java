class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int totalSum = (nums.length*(nums.length+1))/2;
        return totalSum-sum;
    }
}