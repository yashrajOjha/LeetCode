import java.util.*;
public class Solution {
    public static int func(int index, int nums[], int target,int dp[][]){
        if(index==0){
            if(target%nums[0]==0) return target/nums[0];
            else return (int)Math.pow(10,9);
        }
        if(dp[index][target]!=-1) return dp[index][target];
        
        int nottake = 0 + func(index-1,nums,target,dp);
        int take = (int)Math.pow(10,9);
        if(nums[index]<=target) take = 1+func(index,nums,target-nums[index],dp);
        
        return dp[index][target]=Math.min(take,nottake);
    }
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int dp[][] = new int[num.length][x+1];
        for(int rows[]:dp) Arrays.fill(rows,-1);
        int val = func(num.length-1,num,x,dp);
        return (val==(int)Math.pow(10,9))?-1:val;
    }

}
