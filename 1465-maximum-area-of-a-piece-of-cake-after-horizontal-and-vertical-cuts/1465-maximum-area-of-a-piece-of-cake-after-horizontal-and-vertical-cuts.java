class Solution {
    public int maxArea(int h, int w, int[] hC, int[] vC) {
        Arrays.sort(hC);
        Arrays.sort(vC);
        int m=hC.length,n=vC.length,
        H=Math.max(hC[0],h-hC[m-1]),
        V=Math.max(vC[0],w-vC[n-1]);
        for(int i=1;i<m;i++){
            H = Math.max(H,hC[i]-hC[i-1]);
        }
        for(int i=1;i<n;i++){
            V=Math.max(V, vC[i]-vC[i-1]);
        }
        return (int)(H * 1L * V % 1_000_000_007);
    }
}