class Solution {
    public int mirrorReflection(int p, int q) {
        int m =1,n=1;
        while(p%2==0 && q%2==0){
            p=p/2;
            q=q/2;
        }
        return 1-p%2+q%2;
    }
}