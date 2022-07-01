class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int freq[] = new int[1001];
        int max=0;
        for(int box[]:boxTypes){
            freq[box[1]]+=box[0];
        }
        for(int i=1000;i>0;i--){
            if(freq[i]>0){
                max+=Math.min(truckSize,freq[i])*i;
                truckSize-=Math.min(truckSize, freq[i]);
                if(truckSize==0){
                    return max;
                }
            }
        }
        return max;
    }
}