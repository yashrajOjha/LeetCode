class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end)) return 0;
        Set<String> bankset = new HashSet<>(); //for checking if words generated are a part of bank or not
        for(String w:bank) bankset.add(w);
        
        Set<String> visited = new HashSet<>(); //check if the string is already generated previously
        Queue<String> q = new LinkedList<>(); //check which level of mutation we are at
        
        //generate words from these characters only
        char[] charSet = new char[] {'A','C','G','T'};
        q.offer(start);
        visited.add(start);
        
        int level=0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                String curr = q.poll();
                if(curr.equals(end)) return level;
                
                char currArray[]= curr.toCharArray();
                for(int i=0;i<currArray.length;i++){
                    char old = currArray[i];
                    for(char c:charSet){
                        currArray[i]=c; //trying all possible genetic mutations from character set, character by character
                        String next = new String(currArray);
                        if(!visited.contains(next) && bankset.contains(next)){ 
                            //if the string has not been visited and is valid because of bank, then add it to the next level in queue and put it in visited set
                            visited.add(next);
                            q.offer(next);
                        }
                    }
                    currArray[i]=old;
                }
            }
            level++;
        }
        return -1;
    }
}