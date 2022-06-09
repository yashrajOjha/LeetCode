class Solution {
    public int longestConsecutive(int[] nums) {
     if(nums.length == 0 || nums.length==1) return nums.length;
     HashSet<Integer> set = new HashSet<>();
     for(int num:nums){
         set.add(num);
     }
     int max=0;
        for(int num:nums){
           if(!set.contains(num-1)){
               int curr=1;
               int n=num;
               while(set.contains(n+1)){
                   n=n+1;
                   curr+=1;
               }
               max = Math.max(max,curr);
           } 
        }
        return max;
    }
}