class Solution {
    public void premSwap(int index, int arr[], List<List<Integer>> ans){
        if(index==arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(i, index,arr);
            premSwap(index+1, arr, ans);
            swap(i, index,arr);
        }
    }
    public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        premSwap(0, arr, ans);
        return ans;
    }
}