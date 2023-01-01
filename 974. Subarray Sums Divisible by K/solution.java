class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0,rem=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //for sum=0, and count as 1
        for(int a:nums){
            sum+=a;
            rem=sum%k;
            if(rem<0) rem+=k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        return count;
    }
}
