class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i=0;i<n;i++){
            if(gas[i]<cost[i]){
                continue;
            }
            int j = (i+1)%n; //for getting back to the origininal position
            int currGas = gas[i]-cost[i]+gas[j];
            while(j!=i){
                if(currGas<cost[j]) break; //incase we run out of gas we cant start the travel from this index
                int costj = cost[j];
                j=(j+1)%n;
                int gasEarnedAfterJ = gas[j];
                currGas = currGas - costj + gasEarnedAfterJ;
            }
            if(i==j) return i;
        }    
        return -1;
    }
}
