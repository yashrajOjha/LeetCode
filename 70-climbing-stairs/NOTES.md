**How to identify if a questions is a DP problem or not?**
* we tend to use recursion for questions like
* count the number of ways "anything is possible"
* out of a given array find min or max
​
Basically while applying the concept of trying all possible ways.
​
To make things easier:
* We must try to represent things as index,
* Try all possible work on index
* If the question is to count, then sum all the indexes,
* If the question says to find min or max, find min and max of indexes
​
**Recursion (Time Limit Exceeded)**
```
if(n==0) return 0;
if(n==1) return 1;
if(n==2)return 2;
int left = stairs(n-1);
int right = stairs(n-2);
return left+right;
```
​
**Memorization**
```
if(n<=1) return 1;
//create a DP array for n+1 length
dp[0] =1;
dp[1]=1;
for(int i=2;i<=n;i++){
dp[i] = dp[i-1]+dp[i-2];
}
return dp[n];
```
[Article](https://takeuforward.org/data-structure/dynamic-programming-climbing-stairs/)