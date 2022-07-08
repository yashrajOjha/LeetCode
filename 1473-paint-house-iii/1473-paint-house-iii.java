class Solution {

    int[][][] dp = new int[101][101][22];
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        for(int[][] grid : dp) for(int[] row : grid) Arrays.fill(row, -1);
        int result = solve(houses, cost, m, n, target, 0, 0, 0);
        return result == Integer.MAX_VALUE/2 ? -1 : result;
    }

    private int solve(int[] houses, int[][] cost, int m, int n, int target, int index, int neighbours, int lastHouseColor) {
        //neighbours exceed limit
        if (neighbours > target) return Integer.MAX_VALUE/2;

        if(dp[index][neighbours][lastHouseColor] != -1) 
            return dp[index][neighbours][lastHouseColor];
        
        if (index == m) {  //if we reach last house
            return target == neighbours ? 0 : Integer.MAX_VALUE/2;
        } else {
            int result = Integer.MAX_VALUE/2;
            if(houses[index] == 0){ //if house is not painted then we need to paint it, we can do it with n colors
                for(int j = 0; j < n; j++){
                    //minimum of the cost[i][j], and we need to check if we are increasing the count of neighbours or not, so lasthousecolor == j+1
                    result = Math.min(result, cost[index][j] + solve(houses, cost, m, n, target, index + 1, (lastHouseColor == j + 1) ? neighbours : neighbours + 1, j + 1));
                }
            }else{
                //incase the given house is already colored, we go to the next house, if color of this house is same as last house then increase neightbours 
                result = Math.min(result, solve(houses, cost, m, n, target, index + 1, (lastHouseColor == houses[index]) ? neighbours : neighbours + 1, houses[index]));
            }
            return dp[index][neighbours][lastHouseColor] = result;
        }
    }
}