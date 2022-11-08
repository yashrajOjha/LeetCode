import java.util.*;
public class LISprint {
    public static void main(String args[]){
        int arr[] = {5,4,11,1,16,8};
        int n = arr.length;
        int m = 1;
        int lastindex = 0;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        for(int i=0;i<n;i++){
            for(int p=0;p<i;p++){
                if(arr[p]<arr[i] && 1+dp[p]>dp[i]){
                    dp[i] = 1+dp[p];
                    hash[i] = p; //previous largest element, in our case, element hash[element 11] would have index 0
                }
            }
            if(dp[i]>m){
                m = dp[i];
                lastindex=i;
            }
        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(arr[lastindex]);
        // System.out.println(arr[lastindex]);
        while(hash[lastindex]!=lastindex){
            //till we dont reach initialization value
            // System.out.println(hash[lastindex]); updating the hashvalue 
            lastindex= hash[lastindex];
            temp.add(arr[lastindex]);
        }
        for(int ele:temp){
            System.out.println(ele);
        }
    }
}
