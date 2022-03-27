class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int count[] = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) count[i]+=1;
            }
        }
        int index[]= new int[k];
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=0;j<count.length;j++){
                if(count[j]<min){
                    min = count[j];
                    minIndex=j;
                }
            }
            index[i]=minIndex;
            count[minIndex] = Integer.MAX_VALUE;
        }
        return index;
    }
}