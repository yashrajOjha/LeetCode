class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        adjacencylist(edges,map);
        return DFS(0,-1,map,hasApple);
    }
    public int DFS(int curr, int parent,HashMap<Integer, List<Integer>> map,List<Boolean> hasApple){
        int time = 0;
        for(int child:map.getOrDefault(curr,new LinkedList<>())){
            if(child==parent) continue;
            int timefromchild = DFS(child, curr, map, hasApple);
            if(timefromchild>0 || hasApple.get(child)==true){
                time+=timefromchild+2;
            }
        }
        return time;
    }
    public void adjacencylist(int[][] edges, HashMap<Integer,List<Integer>> map){
        for(int []edge:edges){
            int a=edge[0],b=edge[1];
            map.putIfAbsent(a,new LinkedList<>());
            map.putIfAbsent(b,new LinkedList<>());
            map.get(a).add(b);
            map.get(b).add(a);
        }
    }
}
