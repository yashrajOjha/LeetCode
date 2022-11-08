//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    public static int dp[][];
    public static int LIS(int curr, int prev, int a[]){
        if(curr==a.length) return 0;
        
        if(dp[curr][prev+1]!=-1) return dp[curr][prev+1];
        
        int len = 0 + LIS(curr+1,prev,a);
        if(prev==-1 || a[curr]>a[prev]){
            len = Math.max(len, 1 + LIS(curr+1,curr,a));
        }
        return dp[curr][prev+1] = len;
    }
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        dp = new int[size][size+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        return LIS(0,-1,a);
    }
} 