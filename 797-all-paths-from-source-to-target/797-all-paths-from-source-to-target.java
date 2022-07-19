class Solution {
    public void func(int start, int end,int graph[][],List<Integer> ds, List<List<Integer>> res){
        if(start==end){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int n: graph[start]){
                ds.add(n);
                func(n,end,graph,ds,res);
                ds.remove(ds.size()-1);
          
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int end = graph.length-1;
        // int visited[] = new int[graph.length];
        ds.add(0);
        func(0,end,graph,ds,res);
        return res;
    }
}