import java.util.ArrayList;
import java.util.List;

public class printonesubsequence {
    public boolean printsubseq(int index, List<Integer> ds,int[]arr,int s, int sum){
        if(index==arr.length){
            if(s==sum){
                for(int i=0;i<ds.size();i++){
                    System.out.print(ds.get(i));
                }
                System.out.println();
                return true;
            }
            return false ;
        }
        ds.add(arr[index]);
        s+=arr[index];
        /*If one function calls returns true then we dont need to call other functions, that returns true to all previous functions        
        there by not calling the "not taking" part of the recursion call
        */
        if( printsubseq(index+1, ds, arr, s, sum) == true) return true;
        ds.remove(ds.size()-1);
        s-=arr[index];
        if( printsubseq(index+1, ds, arr, s, sum) == true) return true;
        return false;
    }
    public static void main(String args[]){
        printonesubsequence s = new printonesubsequence();
        int arr[] = {1,2,1};
        // int n=3;
        int sum=2;
        List<Integer> ds = new ArrayList<>();
        s.printsubseq(0,ds,arr,0,sum);
    }
}
