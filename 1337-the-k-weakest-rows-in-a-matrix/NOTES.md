**Approach: Brute Force**
* Firstly, we will create an array arr of size mat.length, now, this array will have frequency of number of ones present in each row.
* Now, create ans array of size k, now traverse arr and find the index number with minimum value and put that index number in ans array
* Just to make sure that you have traversed a particular index, mark it by reinitializing that index with Integer.MAX_VALUE