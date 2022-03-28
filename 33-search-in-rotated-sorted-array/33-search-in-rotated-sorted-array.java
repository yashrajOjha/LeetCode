class Solution {
    public int search(int[] arr, int target) {
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                //left part is sorted
                //check for element between the left sorted half
                //between low and high, if yes then change high to mid-1, this eliminates right half
                if(target>=arr[low] && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                //right part is sorted
                //check for element between the right sorted half
                //between low and high, if yes then change low to mid+1, this eliminates left half
                if(target<=arr[high] && target>=arr[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}