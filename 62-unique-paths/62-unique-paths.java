class Solution {
    HashMap<String, Integer> map=new HashMap<>();
    public int uniquePaths(int m, int n) {
        return uniqPath(m-1,n-1);
    }
    public int uniqPath(int m, int n){
        if(m==0 || n==0) return 1;
        String cell=new String(m+" "+n);
        if(map.containsKey(cell)){
            return map.get(cell);
        }
        int up = uniqPath(m-1,n);
        int left = uniqPath(m,n-1);
        map.put(cell, up+left);
        return up+left;
    }
}