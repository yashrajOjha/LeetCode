* visited matrix - 0 for not visited and 1 for visited, we dont respawn again in the same place
* call the recursion
* base already visited the point, or i> rows and j> columns
```
visited[i][j] = true;
down = one function for down i+1,j
left = one function for left i,j-1
right = one function for right i, j+1
up =one function for up i-1,j
visited[i][j]=false;
return grid[i][j] + down + left + right + up;
```