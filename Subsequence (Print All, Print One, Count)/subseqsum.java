import java.util.ArrayList;
import java.util.List;

public class subseqsum {
    public void printsubseq(int index, List<Integer> ds,int[]arr,int s, int sum){
        if(index==arr.length){
            if(s==sum){
                for(int i=0;i<ds.size();i++){
                    System.out.print(ds.get(i));
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[index]);
        s+=arr[index];
        printsubseq(index+1, ds, arr, s, sum);
        ds.remove(ds.size()-1);
        s-=arr[index];
        printsubseq(index+1, ds, arr, s, sum);
    }
    public static void main(String args[]){
        subseqsum s = new subseqsum();
        int arr[] = {1,2,1};
        // int n=3;
        int sum=2;
        List<Integer> ds = new ArrayList<>();
        s.printsubseq(0,ds,arr,0,sum);
    }
}
