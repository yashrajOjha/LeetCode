```
public int func(int i,int j,int grid[][]){
if(i==0 && j==0) return grid[i][j];
if(i<0 || j<0) return Integer.MAX_VALUE;
return grid[i][j] + Math.min(func(i-1,j,grid),func(i,j-1,grid));
}
```
​
```
int dp[][]=new int[n][m];
int dp[][]=new int[n][m];
for(int i=0; i<n ; i++){
for(int j=0; j<m; j++){
if(i==0 && j==0) dp[i][j] = matrix[i][j];
else{
int up = matrix[i][j];
if(i>0) up += dp[i-1][j];
else up += (int)Math.pow(10,9);
int left = matrix[i][j];
if(j>0) left+=dp[i][j-1];
else left += (int)Math.pow(10,9);
dp[i][j] = Math.min(up,left);
}
}
}
return dp[n-1][m-1];
```