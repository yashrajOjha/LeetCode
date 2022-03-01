The idea is to compare the starting and ending of two intervals, if the start of current interval is lesser than the end of previous interval then there is an overlap, if the interval is empty or there is no overlap just add the value to a list `merged.getLast()[1]<interval[0]` else if overlap exists then merge current interval with the previous interval.
​
​
Another approach is to use the concept of start and end of the intervals, blue is interval, red is start, green is end, purple is the pairing after sorting, that is a purple corresponds to one starts[i], ends[i] pair after sorting.
​
![](https://www.dropbox.com/s/40mmgsb710mqykt/Screenshot%202018-02-09%2018.43.49.png?raw=1)