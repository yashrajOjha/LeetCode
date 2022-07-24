class Solution {
    public int func(int dungeon[][], int i, int j, int dp[][]){
        if (i >= dungeon.length || j >= dungeon[0].length)
            return Integer.MAX_VALUE;
        
        if (i == dungeon.length - 1 && j == dungeon[0].length - 1)
            return Math.max(1, 1 - dungeon[i][j]);
        
        if (dp[i][j] != -1)
            return dp[i][j];
        
        int res = Math.min(func(dungeon, i + 1, j,dp), func(dungeon, i, j + 1,dp)) - dungeon[i][j];
        res = Math.max(1, res);
        
        return dp[i][j] = res;
    }
    public int calculateMinimumHP(int[][] dungeon) {
        int dp[][] = new int[dungeon.length][dungeon[0].length];
        for(int i=0;i<dungeon.length;i++){
            for(int j=0;j<dungeon[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return func(dungeon, 0,0,dp);
    }
}