
public class Solution {

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
        int n = arr.length;
        int curr[] = new int[n+1];
        int next[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            for(int p=i-1;p>=-1;p--){
                int len = 0 + next[p+1];
                if(p==-1 || arr[i]>arr[p]){
                    len = Math.max(len, 1+next[i+1]);
                }
               curr[p+1]=len;
            }
            next=curr.clone(); 
        }
        return next[0]; //as we have shifting the indexes
	}

}
