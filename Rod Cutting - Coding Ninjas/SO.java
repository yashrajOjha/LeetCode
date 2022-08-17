class Solution{
    public int cutRod(int price[], int n) {
        //code here
        // int dp[][] = new int[n][n+1];
        int prev[] = new int[n+1];
        int curr[] = new int[n+1];
        
        for(int i=0;i<=n;i++) prev[i] = i*price[0];
        
        for(int i=1;i<n;i++){
            for(int cut=0;cut<=n;cut++){
                int nottake = 0 + prev[cut];
                int take = Integer.MIN_VALUE;
                int cutI = i+1;
                if(cutI<=cut) take = price[i] + curr[cut-cutI];
                
                curr[cut] = Math.max(take,nottake);
            }
            prev=curr;
        }
        return prev[n];
    }
}
