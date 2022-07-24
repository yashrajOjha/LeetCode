class Solution {
    public int func(List<List<Integer>> triangle, int row, int col, int dp[][]){
        if(row==triangle.size()-1) return triangle.get(row).get(col);
        
        if(dp[row][col]!=-1) return dp[row][col];
        
        int down = triangle.get(row).get(col) + func(triangle,row+1, col, dp);
        int diag = triangle.get(row).get(col) + func(triangle, row+1, col+1, dp);
        return dp[row][col] = Math.min(down,diag);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++){
            Arrays.fill(dp[i],-1);
        }
        return func(triangle,0,0,dp);
    }
}