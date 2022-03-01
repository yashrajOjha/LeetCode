The idea here is to use 2 pointers, one to traverse, other to keep track of previous element, because for 4 we get binary as 100, and for 5 we get binary as 101, which means nums[i] will have a 1s count of nums[i-1]+1 count for 1s. Same goes with 6 and 7, 6 has binary of 110 and 7 has binary of 111, so count of 1s in 7 is count of 1s in 6 +1.
​
But heres a catch, for 2, 4, 8, 16 we just get 1 1s, so for that we use the concept of powers, if ** i==power**, then make power as** power * 2** and make previous index **'j' as 0** and add one to it.
​
​
​
​