class Solution {
//     public int func(int ind1, int ind2, String s, String t,int dp[][]){
//         if(ind2<0) return 1;
//         if(ind1<0) return 0;
        
//         if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        
//         if(s.charAt(ind1)==t.charAt(ind2)){
//             return dp[ind1][ind2]=func(ind1-1,ind2-1,s,t,dp) + func(ind1-1,ind2,s,t,dp);
//         }else{
//             return dp[ind1][ind2]=func(ind1-1,ind2,s,t,dp);
//         }
//     }
    public int numDistinct(String s, String t) {
        int l1=s.length(),l2=t.length();
        int[] prev=new int[l2+1];
        int[] curr=new int[l2+1];
        
        prev[0]=1;  // Initializaton 
        curr[0]=1;
        
        for(int ptr1=1;ptr1<=l1;ptr1++)
        {
            for(int ptr2=1;ptr2<=l2;ptr2++)
            {

                if(s.charAt(ptr1-1)==t.charAt(ptr2-1))
                {
                    int take=prev[ptr2-1];
                    int notTake=prev[ptr2];
                    curr[ptr2]=take+notTake;
                }
                else{
                    curr[ptr2]=prev[ptr2];
                }
            }
            prev=(int[])curr.clone();
        }
        return curr[l2];
    }
}