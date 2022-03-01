class Solution {
    public int[] countBits(int n) {
        int []count = new int[n+1];
        for(int i=0;i<=n;i++){
            String s = Integer.toBinaryString(i);
            int c=0;
            for(char ch:s.toCharArray()){
                if(ch=='1') c++;
            }
            count[i]=c;
        }
        return count;
    }
}