class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =0;
      int right =nums.length-1;
      int mid=0;
        int x[]= new int[2];
      x[0]= -1;  x[1]= -1;
      // Finding first index
       while(left<= right)
       {
         mid= left+ (right-left)/2;
         if(nums[mid]== target)
         {
           x[0]= mid;
          right= mid-1;    //such that the loop breaks
         }
         else if(nums[mid]< target)
           left= mid+1;
         else
           right= mid-1;
       }
      // Finding second index
      left =0;
      right =nums.length-1;
      while(left<= right)
       {
        mid= left+ (right-left)/2;
         if(nums[mid]== target)
         {
           x[1]= mid;
          left= mid+1;    //such that the loop breaks
         }
         else if(nums[mid]< target)
           left= mid+1;
         else
           right= mid-1;
       }
      return x;

    }
}