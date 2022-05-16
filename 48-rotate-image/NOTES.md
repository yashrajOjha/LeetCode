The idea is to first **transpose** and then,
```
* i moves from 0 to number of rows
* j moves from i to number of columns
* swap matrix[i][j] and matrix[j][i]
```
**Flip it horizontally**
```
* i moves from 0 to number of rows
* j moves from 0 to number of columns/2
* swap matrix[i][j] and matrix[i][number-of-row-1-j]
```