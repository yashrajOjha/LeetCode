class Solution {
    public int firstUniqChar(String s) {
        int index=Integer.MAX_VALUE;
        int firstIndex =-1;
        for(char ch='a';ch<='z';ch++){
            firstIndex=s.indexOf(ch);
            if(firstIndex!=-1 && firstIndex==s.lastIndexOf(ch)){
                index =Math.min(firstIndex,index);
            }
        }
        if(index == Integer.MAX_VALUE){
            return -1;
        }
        return index;
    }
}