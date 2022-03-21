class Solution {
    List<String> res = null;
    String [] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if(digits.length()==0) return res;
        backtrack(0, digits, new StringBuilder());
        return res; 
    }
    public void backtrack(int len, String digits, StringBuilder temp){
        if(len==digits.length()){
            res.add(temp.toString());
            return;
        } 
        //loop for all character mapping
        char ch = digits.charAt(len);
        String str  = keypad[ch-'0'];
        for(char c:str.toCharArray()){
            //append into temporary string builder
            temp.append(c);
            backtrack(len+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}