class Solution {
    // HashSet<List<Integer>> set = new HashSet<>();
    public void comsum(int index, int target,int arr[],List<List<Integer>> ans, List<Integer> inner){
        if(target==0){
            ans.add(new ArrayList<>(inner));
             return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            
            inner.add(arr[i]);
            comsum(i+1,target-arr[i],arr,ans,inner);
            inner.remove(inner.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(arr.length==0) return ans;
        Arrays.sort(arr);
        comsum(0,target,arr,ans,new ArrayList<Integer>());
        return ans;
    }
}