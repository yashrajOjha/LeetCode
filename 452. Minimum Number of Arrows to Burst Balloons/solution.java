class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[0],b[0])); //sorting based on values of the elements
        int count=1; //incase every balloon overlaps
        int prev[] = new int[2];
        prev = points[0]; 
        for(int i=1;i<points.length;i++){
            int currSP = points[i][0];
            int currEP = points[i][1];

            int prevSP = prev[0];
            int prevEP = prev[1];
            if(currSP>prevEP){
                // current baloon starts from after end of previous baloon, then we'll have to pop them seperately.
                count++;
                prev = points[i];
            }else{
                //overlapping 
                prev[0] = Math.max(prevSP,currSP);
                prev[1] = Math.min(prevEP,currEP);
            }
        }
        return count;
    }
}
