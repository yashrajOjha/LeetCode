class Solution {
    public void rotate(int[][] matrix) {
     int n=matrix.length;
     int newm[][] = new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            newm[j][n-i-1] = matrix[i][j];
         }
     }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j] = newm[i][j];
         }
     }
    }
}