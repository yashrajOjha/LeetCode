class Solution {
    public int totalFruit(int[] fruits) {
        int max=0,count=0;
        int m[]=new int[40001];
        for(int l=0,r=0;r<fruits.length;r++){
            if(m[fruits[r]]++==0){
                count++;
            }
            while(count>2){
                if(--m[fruits[l]]==0){
                    count--;
                }
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}