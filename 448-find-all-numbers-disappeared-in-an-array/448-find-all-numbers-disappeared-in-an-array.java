class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int numbers[]= new int[nums.length];
        ArrayList<Integer> res = new ArrayList<>();
        for(int n:nums){
            numbers[n-1]++;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                res.add(i+1);
            }
        }
        return res;
    }
}