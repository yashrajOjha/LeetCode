**Brute Force** is to store a count array, of length n, increase the count at that index, traverse through count array and find the index which has count>1.
​
Optimal:
Follow the tortoise method, one is a slow pointer(move one step), and one is a fast pointer(move two steps),
* when the slow and fast pointer intersect, place the fast pointer at the start and increase both the pointer steps by 1, this time when they interact you get the element.
​
[Video Answer](https://youtu.be/32Ll35mhWg0)