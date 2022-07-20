class Solution {
    public int maxAdjacent(int arr[]){
        int prev1=arr[0],prev2=0,curr=0;
        for(int i=1;i<arr.length;i++){
            int pick = arr[i] + ((i>1)?prev2:0);
            int notpick = 0 + prev1;
            curr = Math.max(pick,notpick);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0) temp1.add(nums[i]);
            if(i!=nums.length-1) temp2.add(nums[i]);
        }
        int t1[] = new int[temp1.size()];
        int t2[] = new int[temp2.size()];
        for(int i=0;i<temp1.size();i++){
            t1[i]=temp1.get(i);
        }
        for(int i=0;i<temp2.size();i++){
            t2[i]=temp2.get(i);
        }
        return Math.max(maxAdjacent(t1),maxAdjacent(t2));
    }
}