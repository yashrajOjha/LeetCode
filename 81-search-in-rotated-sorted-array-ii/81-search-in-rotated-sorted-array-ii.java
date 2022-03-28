class Solution {
    public boolean search(int[] nums, int target) {
        int low =0,high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target==nums[mid]) return true;
            if(nums[low]<nums[mid]){
              //left part sorted
                if(target<nums[low] || target>nums[mid]){
                    low = mid+1;//move towards right
                }else{
                    //target lies within this part and move the highs, so that search continues in left part.
                    high=mid-1;
                }
            }else if(nums[low]>nums[mid]){
                //right part is sorted
                if(target<nums[mid] || target>nums[high]){
                    //target not on right part
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                low++; //increasing index for skipping duplicates.
            }
        }
        return false;
    }
}