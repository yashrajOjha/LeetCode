Same as Pascals Triangle, instead of storing all the rows in a list, store the current row in a new list, make it as previous list everytime the loop starts again.
​
​
The idea of permutation and combination comes into play:
* row 1 will be 0c0
* row 2 will be 1c0 and 1c1
* row 3 will be 2c0, 2c1 and 2c2
* row 4 will be 3c0, 3c1, 3c2 and 3c3
When we observe, the series is of the form NcR, Nc(R+1),Nc(R+2), so effectively NcR * factor = NcR+1,
* on simplification factor becomes N-R/R+1 which means I-J/J+1