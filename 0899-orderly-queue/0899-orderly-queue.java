class Solution {
    public String orderlyQueue(String s, int k) {
    String ans = s;
    if(k==1){
        for(int i=0;i<s.length();i++){
            String temp = s.substring(i)+s.substring(0,i);
            /*because at some point rotating one character at a time might result in the same string formed,
            for example, cba -> bac -> acb -> cba which is the same as original string
            */
            if(ans.compareTo(temp)>0) ans=temp;
        }
    }else{
        char word[]= s.toCharArray();
        Arrays.sort(word);
        ans = new String(word);
    }
        return ans;
    }
}