class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minVal = Integer.MAX_VALUE;
        int closestSum = 0;
        int n = nums.length;
        for(int i=0;i<n-2;i++){
                int l = i+1,h=n-1;
                while(l<h){
                    int sum = nums[i]+nums[l]+nums[h];
                    int diff = Math.abs(sum-target);
                    if(diff<minVal){
                        minVal = diff; 
                        closestSum = sum;
                    }
                    if(sum>target) h--;
                    else if(sum<target) l++;
                    else return target;
                }
        }
        return closestSum;
    }
}