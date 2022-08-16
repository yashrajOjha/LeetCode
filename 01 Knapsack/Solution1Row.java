/*
From the previous answers we can see that we dont require the elements in the current row,
so we dont need to have an array that stores the current row, we only need the values from the previous row,
and even in the previous row, we only need the values that are on the left side of the current index, 
so what we can do is modify the current index value using the previous index val.
*/

static int knapsack(int[] wt, int[] val, int n, int maxW) {
        int prev[] = new int[maxW+1];
        for(int ind=wt[0];ind<=maxW;ind++){
            prev[ind] = val[0];
        }
        
        for(int index=1;index<n;index++){
            for(int w=maxW;w>=0;w--){
                int nS = 0+prev[w];
                int S = (int)Math.pow(-10,9);
                if(wt[index]<=w){
                    S = val[index]+prev[w-wt[index]];
                }
                prev[w] = Math.max(S,nS);
            }
        }
        return prev[maxW];
}
