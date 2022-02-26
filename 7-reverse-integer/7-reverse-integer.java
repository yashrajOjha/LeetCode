class Solution {
    public int reverse(int x) {
        int r=0;
        int num=(x<0)?(-1*x):x;
        int sign =(x<0)?-1:1;
        while(num>0){
            if (r*sign > Integer.MAX_VALUE/10 || r*sign < Integer.MIN_VALUE/10)
            {
                return 0;
            }
            int d=num%10;
            r=r*10+d;
            num=num/10;
        }
        int val = (x<0)?(-1*r):r;
        return val;
    }
}