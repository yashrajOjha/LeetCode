class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     HashSet<Integer> set=new HashSet<Integer>();
     int left=0,right=0;
     int sum=0,max=0;
     while(left<nums.length && right<nums.length){
         if(!set.contains(nums[right])){
             set.add(nums[right]);
             sum+=nums[right];
             max=Math.max(sum, max);
             right++;
         }else{
             sum-=nums[left];
             set.remove(nums[left]);
             left++;
         }
     }
    return max;
    }
}