| **Numbers** | |2 | 3 | 5 | 4 | 5 | 3 | 4 | 
|--|--|--|--|--|--|--|--|--|
|Sum| 0 | 2 | 5 | 10 | 14 | 19 | 22 | 26 |
|Rem| 0 | 2 | 5 | 3 | 0| 5 | 1 | 5 |
|Count| 1 | 1 | 1 | 1 | 2| 2| 1 | 3 |

We keep the remainder of the sum when divided with the variable 'k', once the remainder count increases, we know the elements between the previous encounter of the remainder and the current remainder will be divisible with the variable k. 
- So when the remainder becomes 0, we see the last time the remainder was 0 and add the count of the last occurrence to the result variable.  (res = 1)
- At the second occurrence of 5, the count becomes 2, but the previous count was 1 so we add 1 to the final result 1 (the subarray sum is (5+4+5=14 which is divisible by k=7)
- When the remainder is 5 encountered again, the count is 3, but we take the previous count of 2, and add it to the result variable (res = 1+1+2 =4)

But here comes the issue, what if there are negative values,
| **Numbers** | |2 | -6 | 3 | 1 | 2 | 8 | 2 | 1 | 
|--|--|--|--|--|--|--|--|--|--|
|Sum| 0 | 2 | -4 | -1 | 0 | 2 | 10 | 12 | 13 |
|Rem| 0 | 2 | 3 | 6 | 0 | 2 | 3 | 5 | 6 |
|Count| 1 | 1 | 1 | 1 | 2| 2| 2 | 1 | 2 |

We add +k when we get a negative remainder, and follow the same way to calculate the subarrays,
- We get the second remainder 0 and add its previous count of 1, res=1
- We get the second remainder 2 and add its previous count of 1, res=2
- We get the second reamainder 3 and add its previous count of 1, res=3
- We get the second reamainder 6, and add its previous count of 1,res =4
