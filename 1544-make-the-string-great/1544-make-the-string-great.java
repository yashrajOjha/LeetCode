class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-c)==32){
                st.pop();
            }else{
                st.push(c);
            }
        }
        String str="";
        Iterator value = st.iterator();
        while(value.hasNext()){
            str+=value.next();
        }
        return str;
    }
}