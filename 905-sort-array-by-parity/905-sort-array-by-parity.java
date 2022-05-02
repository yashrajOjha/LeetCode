class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int start=0,end=nums.length-1;
     int res[] = new int[nums.length];
     for(int i=0;i<nums.length;i++){
         if(nums[i]%2==0){
             res[start]=nums[i];
             start++;
         }else{
             res[end]=nums[i];
             end--;
         }
     }
    return res;
    }
}