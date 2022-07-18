Brute Force approach: Run three nested for loop, **i** from 0 to end, **j** from i+1 to [end], and another for loop from i to j and adding all the values in a variable, and checking if the sum == k, if yes increase the count. **Issue : Time Limit Exceeded**
​
Using extra space of a hashmap, run a for loop, add it to sum variable, check if sum-k is in the map, if yes then add their frequency to the count variable else add the sum-k value into the hashmap. Obviously, when sum[end] is calculated, all its possible sum[start] are already in the map.
```
sum[end] - sum[start] == k
sum[end] - k == sum[start]
```
When sumend is calculated, we only need to determine whether there is key == sumend  - k in the hashmap and add the number of occurence to the answer.
​