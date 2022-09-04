class Solution {
    public int func(int n){
        if(n<=1) return 1;
        int ans= 0;
        for(int i=1;i<=n;i++){
            ans+=func(i-1)*func(n-i);
        }
        return ans;
    }
    public int numTrees(int n) {
        return func(n);
    }
}