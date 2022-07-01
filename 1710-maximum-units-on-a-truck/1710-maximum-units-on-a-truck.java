class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
     int max=0,rem=truckSize;
     for(int i=0;i<boxTypes.length;i++){
         if(boxTypes[i][0]<=rem && rem>0){
             max+=boxTypes[i][0]*boxTypes[i][1];
             rem-=boxTypes[i][0];
         }else{
             max+=Math.min(rem, boxTypes[i][0])*boxTypes[i][1];
             rem-=Math.min(rem,boxTypes[i][0]);
         }
     }
        return max;
    }
}