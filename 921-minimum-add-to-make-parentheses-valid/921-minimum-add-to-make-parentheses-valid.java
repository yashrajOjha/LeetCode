class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
            }
            else{
                if(st.isEmpty() && (s.charAt(i)=='(' || s.charAt(i)==')')){
                        count++;
                }
                else{
                    char ch = st.pop();
                    if(ch=='(' && s.charAt(i) ==')'){
                        count--;
                        continue;
                    }
                }
        }
     }
    return count;
    }
}