class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int minAvgDiff = Integer.MAX_VALUE;
        long currPrefixSum = 0;
        
        // Get total sum of array.
        long totalSum = 0;
        for(int ele:nums) totalSum+=ele;
        
        for (int index = 0; index < n; ++index) {
            currPrefixSum += nums[index];
            long leftPartAverage = currPrefixSum;
            leftPartAverage /= (index + 1);
            
            long rightPartAverage = totalSum - currPrefixSum;
            rightPartAverage/= Math.max(n-1-index,1);
            
            int currDifference = (int) Math.abs(leftPartAverage - rightPartAverage);
            if(currDifference ==0) return index;
            if (currDifference < minAvgDiff) {
                minAvgDiff = currDifference;
                ans = index;
            }
        }
        
        return ans;
    }
}