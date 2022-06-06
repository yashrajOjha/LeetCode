class Solution {
    public List<Integer> majorityElement(int[] nums) {
     List<Integer> res = new ArrayList<>();
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int n:nums){
         map.put(n,map.getOrDefault(n,0)+1);
     }
     for(int n:map.keySet()){
         if(map.get(n)>(nums.length/3)){
             res.add(n);
         }
     }
        return res;
    }
}