Creating a frequency map of the array,
* the possibility of 1 (count 2), 2 (count 2), 5 (count 2) adding up to 8 can be measured as **2C1 for 1 x 2C1 for 2 x 2C1 for 5**. **When the number of elements differ from each other a[i]<a[j]<a[k] we need to count the frequencies of the number and multiply the nC1 of each number.**
* If there are cases like `arr[i]==arr[j]!=arr[k]` then the answer becomes **number1C1 * number2!/(number-2)! x 2!**
* Another case might be all the three positions might be the same, so we need to do numberC3.