class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        int x=pattern.length();
        if(x!=arr.length) return false;
        HashMap<Character,Integer> pat = new HashMap<Character,Integer>();
        HashMap<String,Integer> str = new HashMap<String,Integer>();
        for(int i=0;i<x;i++){
            int indexP = pat.getOrDefault(pattern.charAt(i),-1);
            int indexS = str.getOrDefault(arr[i],-1);
            if(indexP!=indexS){
                return false;
            }
            pat.put(pattern.charAt(i),i);
            str.put(arr[i],i);
        }
        return true;
    }
}