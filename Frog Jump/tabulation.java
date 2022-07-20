import java.util.*;
public class tabulation {
    public static void main(String args[]){
        int heights[] = {10,20,30,10};
        // int dp[] = new int[heights.length+1]; 
        // Arrays.fill(dp,-1);
        // dp[0] = 0; 
        int prev1 = 0, prev2 = 0, curr=0;
        for(int i=1;i<heights.length;i++){
            int oneStep = prev1 + Math.abs(heights[i]-heights[i-1]);
            int twoStep = Integer.MAX_VALUE;
            if(i>1){
                twoStep = prev2 + Math.abs(heights[i]-heights[i-2]);
            }
            // dp[i] = Math.min(twoStep, oneStep);
            curr = Math.min(twoStep, oneStep);
            prev2=prev1;
            prev1=curr;
        }
        // System.out.println(dp[heights.length-1]);
        System.out.println(prev1);
    }
}
