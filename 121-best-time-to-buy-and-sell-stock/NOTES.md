Normal Approach, select a minimum if prices[i] < min, else if price[i]-min> max set max as price[i]-min.
​
**Dynamic Problem**
* In DP on stocks people tend to ask you to perform **space optimization**
* naturally to maximize you have to buy before selling, and it can only be done once,
* when we sell on the **ith** day we need buy minimum from **1 to i-1** th day
* we need to keep track every minimum on the left for a price on the right.
​
<h5 style="color:red">**Why DP on this problem? In DP you have to remember your previous steps, in this question we are remembering the previous minimums.**</h5>