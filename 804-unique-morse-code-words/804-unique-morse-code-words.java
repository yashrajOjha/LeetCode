class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String values[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String w:words){
            String s="";
            for(char ch:w.toCharArray()){
                s+=values[(int)ch-97];
            }
            set.add(s);
        }
        return set.size();
    }
}