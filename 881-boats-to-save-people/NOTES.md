**Brute Force**: use two for loops iterate through and then when people[i]+people[j]<=limit increase count and make visited as true, this will clear up pairs, loop through unvisited nodes and increase the count.
​
​
**Optimal**:
* sort the array
* make two pointer iteration ```i from 0 and j from length of array-1 ``` and manage the count
* when sum(people[i] + people[j]) is less than equal to the limit increase the count, increase i and decrease j
* if the sum is greater than the limit, ship out the greater element and reduce the j count.