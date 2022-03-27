class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        //declaring a comparator
        Comparator <int[]> customCompare = new Comparator<>(){
            @Override
            public int compare(int a[],int b[]){
                if(a[0]==b[0]){
                    return b[1]-a[1];
                }else{
                    return b[0]-a[0];
                }
            }
        };
        PriorityQueue<int []> pq = new PriorityQueue<>(customCompare); //count and row index 
        for(int i=0;i<mat.length;i++){
            int []row = mat[i];
            int countOnes = getCount(row);
            pq.offer(new int[]{countOnes,i});
            if(pq.size()>k){
                pq.poll();
            }
            }
        int ans[] = new int[k];
            int i=k-1;
            while(!pq.isEmpty()){
                ans[i]=pq.poll()[1];
                i--;
            }
        return ans;
    }
    public int getCount(int [] rows){
        int count=0;
        for(int ele:rows){
            if(ele==1) count++;
        }
        return count;
    }
}