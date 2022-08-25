class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rowVal[] = new int[grid.length];
        int colVal[] = new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                rowVal[i] = Math.max(rowVal[i],grid[i][j]);
                // System.out.print("Row Max :grid val- "+grid[i][j]+"rowVal max :"+rowVal[i]);
                colVal[j] = Math.max(colVal[j],grid[i][j]);
                // System.out.print("Col Max :grid val- "+grid[i][j]+"colVal max :"+colVal[j]);
            }
            // System.out.println();
            // System.out.println("New Row");
        }
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ans += Math.min(rowVal[i],colVal[j]) - grid[i][j];
            }
        }
        return ans;
    }
}