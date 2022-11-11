class Solution {
    public int removeDuplicates(int[] nums) {
        int r=0,p=0;
        if(nums.length ==0 ) 
            return 0;
        while(p<nums.length)
        {
            if(nums[p]> nums[r])
            {
                r++;
                nums[r]=nums[p];
            }
            p++;
        }
        return r+1;
    }
}