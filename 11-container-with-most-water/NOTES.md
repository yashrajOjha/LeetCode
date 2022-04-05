**Brute Force**: starting from one line, move till another line where water stored is maximum, we need to explore all pairs of lines, **but only minimum height is responsible for containing the water, one side can be 7 and another can be 8, but water filled until 8 might not be ideal scenario.**
```
int h = Math.min(height[i],height[j]);
int Area = h*(j-i);
area = Math.max(area, Area);
```
​
**Optimized Approach**:
* What? Take two pointers, one at starting one at ending, water to be stored is `min of height of i,j * j-i`
* we then technically have to update i and j,
* if i is updated, height increased, then height might increase and so will water capacity,
* if j is updated(decrement), then height of j will increase but because height of i is less the water capacity will still be less, or height of j will decrease and water capacity will reduce further.
​

So technically jiska bhi height minimum hai uske side se increment ya decrement kardo.
