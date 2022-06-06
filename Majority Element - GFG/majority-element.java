// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<n; i++){
           if(map.containsKey(arr[i])){
               int c = map.get(arr[i]);
               map.put(arr[i], c+1);
           }
           else{
               map.put(arr[i], 1);
           }
       }
        Set<Map.Entry<Integer,Integer>> s = map.entrySet();
       for(Map.Entry<Integer, Integer> i : s){
           int x = i.getValue();
           if(x>n/2){
               return i.getKey();
           }
       }
       return -1;
    }
}