class Solution {
    public boolean func(int n, int arr[], int k){
        boolean prev[] = new boolean[k+1];
//         boolean curr[] = new boolean[k+1];
        prev[0]=true; //curr[0]=true; //base case
        if(arr[0]<=k) prev[arr[0]]=true; //base case
        for(int index=1;index<n;index++){
            boolean curr[] = new boolean[k+1];
            curr[0]=true;
            for(int target=1;target<=k;target++){
                boolean nottake = prev[target];
                boolean take = false;
                if(arr[index]<=target){
                    take = prev[target-arr[index]];
                }
                curr[target] = take || nottake;
            }
            prev=curr;
        }
        return prev[k];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalSum =0;
        for(int val:nums) totalSum+=val;
        if(totalSum%2!=0) return false;
        return func(n,nums,totalSum/2);
    }
}