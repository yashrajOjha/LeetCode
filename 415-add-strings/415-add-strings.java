class Solution {
    public String addStrings(String num1, String num2) {
        if(num1=="0" && num2=="0") return "0";
        StringBuilder sb = new StringBuilder();
        int x=num1.length()-1;
        int y=num2.length()-1;
        int carry=0;
        while(x>=0 || y>=0 || carry>0){
            int n1=0,n2=0;
            if(x>=0){
                n1=num1.charAt(x--)-'0';
            }
            if(y>=0){
                n2=num2.charAt(y--)-'0';
            }
            int sum=n2+n1+carry;
            carry=sum/10;
            sb.append(sum%10);
        }
        return sb.reverse().toString();
    }
}