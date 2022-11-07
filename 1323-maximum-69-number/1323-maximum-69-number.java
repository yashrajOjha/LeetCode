class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char ch[]= s.toCharArray();
        int res = (int) Math.pow(10,-9);
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i]='9';
                String temp = new String(ch);
                res = Math.max(res,Integer.valueOf(temp));
                ch[i]='6';
            }
        }
        return (res==(int)Math.pow(10,-9))?num:res;
    }
}