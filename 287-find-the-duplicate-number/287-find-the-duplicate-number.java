class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup=0;
        
        for(int num:nums){
            if(set.contains(num)){
                dup=num;
                break;
            }else{
                set.add(num);
            }
        }
        return dup;
    }
}