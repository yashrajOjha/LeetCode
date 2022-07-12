class Solution {
    private void recurPerm(int arr[], List<Integer> ds, List<List<Integer>> ans, int map[]){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<arr.length;i++){
            if(map[i]!=1){
                map[i]=1;
                ds.add(arr[i]);
                recurPerm(arr,ds,ans,map);
                ds.remove(ds.size()-1);
                map[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> ans = new ArrayList<>();
     List<Integer> ds =new ArrayList<>();
     int map[] = new int[nums.length];
     recurPerm(nums, ds, ans,map);
     return ans;
    }
}