class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++) dp[i][0]=0;
        for(int i=0;i<=m;i++) dp[0][i]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int len = dp[n][m];
        int i = n, j=m;
        String s="";
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                s+=str1.charAt(i-1);
                len--;
                i--;j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                s+=str1.charAt(i-1);
                i--;
            }else{
                s+=str2.charAt(j-1);
                j--;
            }
        }
        while(i>0) {s+=str1.charAt(i-1); i--;}
        while(j>0) {s+=str2.charAt(j-1); j--;}
        
        String str = new StringBuilder(s).reverse().toString();
        return str;
    }
}