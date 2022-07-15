class Solution {
    public int minAddToMakeValid(String s) {
        int count=0,count2=0;
    for(char c:s.toCharArray()){
        if(c=='(')count++;
        else{
            if(count>0){
                count--;
            }
            else{
                count2++;
            }
        }
    }
        return count+count2;
    }
}