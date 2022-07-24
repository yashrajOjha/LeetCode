```
public int func(int i,int j,int grid[][]){
if(i==0 && j==0) return grid[i][j];
if(i<0 || j<0) return Integer.MAX_VALUE;
return grid[i][j] + Math.min(func(i-1,j,grid),func(i,j-1,grid));
}
```