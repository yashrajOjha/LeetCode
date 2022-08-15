class Solution {
    public int getVal(char ch){
        int val=0;
        if(ch=='I') val=1;
        else if(ch=='V') val=5;
        else if(ch=='X') val=10;
        else if(ch=='L') val=50;
        else if(ch=='C') val=100;
        else if(ch=='D') val=500;
        else if(ch=='M') val=1000;
        
        return val;
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int a = getVal(s.charAt(i));
            int b = getVal(s.charAt(i+1));
            if(a<b){
                sum-=a;
            }else{
                sum+=a;
            }
        }
        sum+=getVal(s.charAt(s.length()-1));
        return sum;
    }
}