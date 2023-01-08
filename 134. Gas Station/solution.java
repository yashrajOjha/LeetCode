class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost =0, totalearned =0;
        for(int g:gas)totalearned+=g;
        for(int c:cost)totalcost+=c;
        if(totalcost>totalearned) return -1; //the spending can never be more than the earning
        int total=0;
        int result=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                // if at any index the total becomes negative, we know that we can't start at that index
                total=0;
                result=i+1;
            }
        }
        return result;

    }
}
