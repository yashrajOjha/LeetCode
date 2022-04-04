Brute force would be to store the linked list to an array then convert the array to the linked list. The issue is we have to traverse the array twice.
​
Optimal : Using fast and slow pointer appraoch,
* first reduce k by 1, cz we are already at the first node,
* move head of the first node by k times, and move second until first reaches null,
* when the condition fails, we are at the right swapping positions.