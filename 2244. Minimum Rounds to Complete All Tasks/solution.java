class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        int round=0;
        for(int count : map.values()){
            if(count==1) return -1;
            else if(count%3==0) round+=count/3;
            else round+=(count/3)+1;
        }
        return round;
    }
}
