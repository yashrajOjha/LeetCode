class Solution {
    public int candy(int[] r) {
        int left[] = new int[r.length];
        int right[] = new int[r.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=0;i<r.length-1;i++){
            if(r[i]<r[i+1]){
                left[i+1]=left[i]+1;
            }
        }
        // for(int i=0;i<left.length;i++){
        //     System.out.println(left[i]+" ");
        // }
        for(int i=r.length-1;i>0;i--){
            if(r[i-1]>r[i]){
                right[i-1]=right[i]+1;
            }
        }
        // for(int i=0;i<right.length;i++){
        //     System.out.println(right[i]+" ");
        // }
        int s=0;
        for(int i=0;i<r.length;i++){
            s+=Math.max(left[i],right[i]);
        }
        return s;
    }
}