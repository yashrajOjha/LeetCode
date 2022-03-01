class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int start[] = new int[n];
        int end[] = new int[n];
        for(int i=0;i<n;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        LinkedList<int[]> merged = new LinkedList<>();
        for(int i=0,j=0;i<n;i++){
            if(i==n-1 || start[i+1]>end[i]){
                int interval[] = {start[j],end[i]};
                merged.add(interval);
                j=i+1;
            }
        }
        return merged.toArray(new int[0][]);
    }
} 