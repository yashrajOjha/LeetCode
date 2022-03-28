[Explanation for the question (but without duplicated)](https://github.com/yashrajOjha/LeetCode-Java/blob/main/81-search-in-rotated-sorted-array-ii/81-search-in-rotated-sorted-array-ii.java)
​
Brute Force would be ** linear search** with O(n) time complexity.
​
Check for which part is sorted,
* if right part is sorted, then **check for target between a[mid] and a[high]**, if so then change low to mid+1, else change high to mid-1;
* if left part is sorted, then **check for target between a[low] and a[mid]**, if so then change high to mid-1, else change low to mid+1;
​