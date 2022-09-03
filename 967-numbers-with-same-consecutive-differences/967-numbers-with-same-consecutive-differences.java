class Solution {
    public void func(int num, int digit, int n, int k, List<Integer> res){
        if(n==0){
            res.add(num);
            return;
        }
        if(digit+k<=9){
            func(num*10+(digit+k),digit+k,n-1,k,res);
        }
        if(k!=0 && digit-k>=0){
            func(num*10+(digit-k),digit-k,n-1,k,res);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++){
            // func(i,res,String.valueOf(i),n,k);
            func(i,i,n-1,k,res);
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            arr[i] = res.get(i);
        return arr;
    }
}