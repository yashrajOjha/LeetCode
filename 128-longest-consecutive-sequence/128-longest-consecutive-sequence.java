class Solution {
    public int longestConsecutive(int[] nums) {
     if(nums.length == 0 || nums.length==1) return nums.length;
     Arrays.sort(nums);
     int count=0,curr=1;
     for(int i=1;i<nums.length;i++){
         if(nums[i]-1==(nums[i-1])){
             curr++;
         }
         else if(nums[i]==nums[i-1]){
             continue;
         }else{
          count = Math.max(count,curr);
          curr=1;
         }
     }
    return Math.max(curr,count);
    }
}