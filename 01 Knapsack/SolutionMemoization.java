    public static int func(int W, int wt[], int val[], int index,int dp[][]){
        if(index==0){
            if(wt[index]<=W) return val[index];
            else return 0;
        }
        
        if(dp[index][W]!=-1) return dp[index][W];
        
        int dS = 0 + func(W, wt, val, index-1,dp);
        int S = 0;
        if(wt[index]<=W){
            S = val[index] + func(W-wt[index],wt,val,index-1,dp);
        }
        return dp[index][W]=Math.max(S,dS);
    }
