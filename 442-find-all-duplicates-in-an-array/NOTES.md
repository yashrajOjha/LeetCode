**Brute Force**: Create a count array, traverse array and find duplicate elements.
​
​
**Optimal**: Here we can use the index of array as a marker for number's duplicacy,
simply traverse the array and at every point check the value at the idx let say it is 5 then go to idx 4 and check if it has negative value it means number 5 is already visited, else
make the number at idx 4 negative to indicate the number 5 is visited.