class Solution {
    public int[] countBits(int n) {
        int []count = new int[n+1];
        count[0]=0;
        int power=1;
        for(int i=1,j=0;i<=n;i++,j++){
            if(i==power){
                power*=2;
                j=0;
            }
            count[i]=count[j]+1;
        }
        return count;
    }
}