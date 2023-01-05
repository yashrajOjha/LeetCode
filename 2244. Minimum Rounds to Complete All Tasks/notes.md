### [Question Link](https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/)

This is a greedy problem becaue we need to finish the tasks sooner, in counts of 3 preferably, any count can be mentioned in terms of 3, the count values will be stored in a hashmap.
| 1|2 |3|4|5|6|7
|-|-|-|-|-|-|-|
| 3k+1| 3k+2|3k|3k+1|3k+2|3k|3k+1|
|k=0|k=0|k=1|k=1|k=1|k=2|k=2|

As we can see any count can be expressed in terms of 3, we can leverage it,
- if the count%3 is 0, then we can add count/3 to the rounds
- if the count%3 is not 0, then we can add count/3+1 to the rounds, let's assume there is a count of 13, naturally we would add 3 rounds of 3, then 2 round of 2 (3+3+3+2+2=13 count)
- if the count is 1 for any particular task, then we cant complete it cause we can either complete 2 or 3 tasks at once.
