class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        if(ransomNote.isEmpty() && magazine.isEmpty()) return true;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:magazine.toCharArray()){
            if(map.containsKey(ch)){
                int c=map.get(ch);
                if(--c==0) map.remove(ch);
                else {map.put(ch,c);}
            }
            if(map.size()==0) return true;
        }
        return false;
    }
}