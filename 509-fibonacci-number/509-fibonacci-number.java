class Solution {
    public int fib(int n) {
        int a=0,b=1;
        if(n==0) return a;
        if(n==1) return b;
        int sum=0;
        while(n-->1){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}