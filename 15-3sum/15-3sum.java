class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
                if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                    int l=i+1,h=n-1,sum=0-nums[i];
                    while(l<h){
                        if(nums[l]+nums[h]==sum){
                           res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                           while(l<h && nums[l]==nums[l+1])l++;
                           while(l<h && nums[h]==nums[h-1])h--;
                           l++;h--;
                        }else if(nums[l]+nums[h]>sum) h--;
                        else l++;
                    }
                }           
        }
        return res;
    }
}