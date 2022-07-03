class Solution {
    public int wiggleMaxLength(int[] nums) {
        int down=1,up=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<0){
                down=up+1;
            }else if(nums[i]-nums[i-1]>0){
                up=down+1;
            }
        }
        return Math.max(up,down);
    }
}