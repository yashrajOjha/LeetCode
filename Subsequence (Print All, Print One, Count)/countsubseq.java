import java.util.ArrayList;
import java.util.List;

public class countsubseq {
    public int csubseq(int index, List<Integer> ds,int[]arr,int s, int sum){
        if(index==arr.length){
            if(s==sum){
                for(int i=0;i<ds.size();i++){
                    System.out.print(ds.get(i));
                }
                System.out.println();
                return 1;
            }
            return 0;
        }
        ds.add(arr[index]);
        s+=arr[index];
        int l = csubseq(index+1, ds, arr, s, sum);
        ds.remove(ds.size()-1);
        s-=arr[index];
        int r = csubseq(index+1, ds, arr, s, sum);
        return l+r;
    }
    public static void main(String args[]){
        countsubseq s = new countsubseq();
        int arr[] = {1,2,1};
        // int n=3;
        int sum=2;
        List<Integer> ds = new ArrayList<>();
        System.out.println(s.csubseq(0,ds,arr,0,sum));
    }
}