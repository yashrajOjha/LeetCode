// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int rep[] = new int[2];
        int count[] = new int[n];
        for(int i=0;i<n;i++){
            count[arr[i]-1]++;
            if(count[arr[i]-1]>1){
                rep[0]=arr[i];
            }
        }
        // int ind=0;
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                rep[1]=i+1;
                // ind++;
            }
        }
        return rep;
    }
}