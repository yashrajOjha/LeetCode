class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        String str = "";
        Iterator value = st.iterator();
        while(value.hasNext()){
            str+=value.next();
        }
        return str;
    }
}