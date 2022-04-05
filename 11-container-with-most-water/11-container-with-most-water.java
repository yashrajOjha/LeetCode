class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int water=0;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            water = Math.max(water, (h*w));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water;
    }
}