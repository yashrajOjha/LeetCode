import java.util.*;
public class Solution {
    public static int func(int index, int N, int price[], int dp[][]){
        if(index==0) return N*price[0];
        
        if(dp[index][N]!=-1) return dp[index][N];
        
        int nT = 0 + func(index-1,N,price, dp);
        int T = Integer.MIN_VALUE;
        int rodL = index+1;
        if(rodL<=N) T = price[index] + func(index,N-rodL,price,dp);
        
        return dp[index][N] = Math.max(nT,T);
    }
	public static int cutRod(int price[], int n) {
		// Write your code here.
        int dp[][] = new int[n][n+1];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        
        return func(n-1,n,price,dp);
	}
}
