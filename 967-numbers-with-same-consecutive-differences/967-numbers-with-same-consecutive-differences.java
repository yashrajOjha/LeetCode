class Solution {
    public void func(int num, List<Integer> res, String val, int n, int k){
        if(val.length()==n){
            res.add(Integer.valueOf(val));
            return;
        }
        
        for(int i=0;i<=9;i++){
            if(Math.abs(num-i)==k){
                func(i,res,val+String.valueOf(i),n,k);
            }
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++){
            func(i,res,String.valueOf(i),n,k);
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            arr[i] = res.get(i);
        return arr;
    }
}