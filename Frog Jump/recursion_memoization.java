// package Frog Jump;
import java.util.*;
public class recursion_memoization {
    // public int left =0,right=0;
    public int func(int index, int jump[], int dp[]){
        if(index==0) return 0;
        if(dp[index]!=-1) return dp[index];
        int right = Integer.MAX_VALUE;
        int left = func(index-1, jump,dp) + Math.abs(jump[index]-jump[index-1]);
        if(index>1)
            right = func(index-2,jump,dp) + Math.abs(jump[index]-jump[index-2]);

        return dp[index]=Math.min(left,right);
    }
    public static void main(String args[]){
        int jump[] = {10,20,30,10};
        int dp[] = new int[jump.length+1];
        Arrays.fill(dp,-1);
        recursion_memoization obj = new recursion_memoization();
        int val = obj.func(3,jump,dp);
        System.out.println(val);
    }
}
