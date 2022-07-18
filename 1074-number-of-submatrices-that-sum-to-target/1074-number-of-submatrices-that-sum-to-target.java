class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int sum[][] = new int[rows][cols+1];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=1;j<cols+1;j++){
                sum[i][j] = sum[i][j-1]+matrix[i][j-1];
            }
        }
        
        for(int start=0;start<cols+1;start++){
            for(int end=start+1; end<cols+1;end++){
                int sumSub=0;
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0,1);
                for(int l=0;l<rows;l++){
                    sumSub+=sum[l][end]-sum[l][start];
                    if(map.containsKey(sumSub-target)){
                        count+=map.get(sumSub-target);
                    }
                    map.put(sumSub, map.getOrDefault(sumSub,0)+1);
                }
            }
        }
        return count;
    }
}