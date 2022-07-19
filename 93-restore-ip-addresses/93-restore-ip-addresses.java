class Solution {
    //index we are at, dots count
    public void ipAdd(int index, int dots,String currIP,String s,List<String> res){
        if(dots==4 && index==s.length()){
            res.add(currIP.substring(0,currIP.length()-1));
            return;
        }
        if(dots>4) return; //base case of exceeding the dots
        for(int i=index;i<Math.min(index+3,s.length());i++){
            int val = Integer.valueOf(s.substring(index,i+1));
            if(val<256 && (index==i || s.charAt(index)!='0')){
                //value of the string must be less than 256 and there should be no leading zeroes, either the character is 0, or the string is 12345 excectra, if its not of 1 length, then the first character of the substring should not be 0
                ipAdd(i+1,dots+1,currIP+s.substring(index,i+1)+".",s,res);
            }
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length()> 12) return res; //cant create a valid ip address
        ipAdd(0,0,"",s,res);
        return res;
    }
}