class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> inner,prev = null;
        for(int i=0;i<numRows;i++){
            inner = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) inner.add(1);
                else{
                    inner.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = inner;
            main.add(inner);
        }
        return main;
    }
}