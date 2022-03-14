class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String paths[]= path.split("/");
        for(String p:paths){
            if(!stack.empty() && p.equals("..")){
                stack.pop();
            }else if(!p.equals("") && !p.equals(".") && !p.equals("..")){
                stack.push(p);
            }
        }
        List <String> ls = new ArrayList<>(stack);
        return "/"+String.join("/",ls);
    }
}