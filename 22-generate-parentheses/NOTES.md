One thing we need to understand is, we need a way to add “(” and “)” to all possible cases and then find a way to validate so that we don’t generate the unnecessary ones.
​
The first condition is if there are more than 0 open / left brackets, we recurse with the right ones. And if we have more than 0 right brackets, we recurse with the left ones. Left and right are initialized with'n'- the number given.
```
if left>0:
helper(ans, s+'(', left-1, right)
if right>0:
helper(ans, s+')', left, right-1)
```
There’s a catch. We can’t add the “)” everytime we have right>0 cause then it will not be balanced. We can balance that with a simple condition of left<right.
```
if left>0:
if left>0:
helper(ans, s+'(', left-1, right)
if right>0 and left<right:
helper(ans, s+')', left, right-1)
```