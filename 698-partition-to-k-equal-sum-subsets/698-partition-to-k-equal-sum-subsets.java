class Solution {
    public boolean func(int index, int startSum, int k, int nums[], boolean visited[], int subSum){
        if(k==1) return true;
        /*when k == 1, which means you already found k - 1 subsets with target sum. The remaining last group surely contains target sum.
        Assuming k = 3, nums is divided in to subsets a, b, and c, and we can tell sum(nums) = sum(a) + sum(b) + sum(c) = subset_sum * 3 from the beginning. If sum(a) == sum(b) == subset_sum, then sum(c) must be subset_sum.
*/
        if(startSum==subSum) return func(0,0,k-1,nums,visited,subSum);
        /*once we are done with one subset, for the next subset we are starting again with index 0*/
        for(int i=index;i<nums.length;i++){
            if(visited[i]!=true && startSum+nums[i]<=subSum){
                visited[i]=true;
                if(func(i+1,startSum+nums[i],k,nums,visited,subSum)) return true;
                visited[i]=false;
            }
        }
        return false;
    }
    void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        boolean visited[] = new boolean[nums.length];
        Arrays.fill(visited,false);
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%k!=0) return false; //when k is 5 and sub of the array is 11
        int subSum = sum/k;
        Arrays.sort(nums);
        reverse(nums);
        return func(0,0,k,nums,visited,subSum);
    }
}