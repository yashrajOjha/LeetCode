class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int count[] = new int[nums.length];
        for(int n:nums){
            count[n-1]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                res.add(i+1);
            }
        }
        return res;
    }
}