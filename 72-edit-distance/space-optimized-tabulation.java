
public class Solution {

    public static int editDistance(String s, String t) {
        //Your code goes here
        int n = s.length();
        int m = t.length();
        int curr[] = new int[m+1];
        int prev[] = new int[m+1];
        //base case
        for(int j=0;j<=m;j++) prev[j]=j;
        //tabulation with space optimization
        for(int i=1;i<=n;i++){
            curr[0]=i;
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)) curr[j]=prev[j-1];
                else{
                    curr[j] = 1 + Math.min(curr[j-1],Math.min(prev[j-1],prev[j]));
                }
            }
            prev = (int[])(curr.clone());
        }
        return prev[m];
    }
}
