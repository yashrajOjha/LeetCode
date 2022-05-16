class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> ds = new LinkedList<>();
        for(int []interval:intervals){
            if(ds.isEmpty()|| ds.getLast()[1]<interval[0]){
                ds.add(interval);
            }else{
                ds.getLast()[1] = Math.max(ds.getLast()[1],interval[1]);
            }
        }
        return ds.toArray(new int[ds.size()][]);
    }
}