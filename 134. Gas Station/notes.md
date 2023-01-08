### [Question Link](https://leetcode.com/problems/gas-station/description/)

**"If your spending is more than you earning then you can't complete a cycle"**, this question follows the rules, if spending is more than gas earned then we cant complete the station loop. Let's start at index 0, and calculate the total (gas earned+cost at the station), if total becomes negative, then we can't start the journey from that index, if we get a series of positive totals, then we can start from the index we didn't have a negative total.
