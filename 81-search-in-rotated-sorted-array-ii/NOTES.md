The array is sorted but its rotated around a point, anytime we come across the word **"sorted"** then we have to use **binary search**.
​
The basic approach for binary search is:
* `if target == arr[mid] return true`,
* `if target<arr[mid]; high = mid-1;`
* `if target>arr[mid]; low = mid+1;`
​

In this question we need to find the sorted part of the array, if `arr[low]<arr[mid]` then left part is sorted, if `arr[mid]<arr[high]` then right part is sorted. **For every case check if element lies within which part of the array and place your high and low pointer accordingly.**
