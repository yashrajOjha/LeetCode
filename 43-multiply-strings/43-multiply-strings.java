class Solution {
    public String multiply(String num1, String num2) {
     if(num1.equals("0")||num2.equals("0")) return "0";
     int l1 = num1.length();
     int l2 = num2.length();
     int res[]= new int[l1+l2]; //maximum length of a result can only be combined length
     int i=l2-1,pf=0;
     while(i>=0){
         int ival = num2.charAt(i)-'0';
         i--;
         int carry=0,j=l1-1;
         int k = res.length-1-pf;
         while(j>=0 || carry!=0){
             int jval = (j>=0)?num1.charAt(j)-'0':0;
             j--;
             int product = ival*jval + carry + res[k];
             res[k]= product%10;
             carry = product/10;
             k--;
         }
         pf++; /*power factor decides where we need to start adding the values from, it increases as we shift down to the next multiplier value, 123*456, after we multiply 6 with 123, we move left and then start multiplying 5 with 123, so effectively power factor decides how much we move by.*/  
        }
        //to remove leading zeroes find a non zero element using a flag and iterate from that flag.
        String str ="";
        boolean flag = false;
        for (int val:res){
            if(val==0 && flag==false){
                continue;
            }else{
                flag =true;
                str+=val;
            }
        }
        return str;
    }
}