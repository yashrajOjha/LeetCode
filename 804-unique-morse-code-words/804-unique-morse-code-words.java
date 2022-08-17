class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String values[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String w:words){
            String s="";
            for(char ch:w.toCharArray()){
                s+=values[ch-'a'];
            }
            set.add(s);
        }
        return set.size();
    }
}