In two pass approach you store the number of 0s,1s and 2s, then run a for loop and store the count of 0s,1s and 2s.
```
int red=0,white=0,blue=0;
for(int i=0;i<nums.length;i++){
if(nums[i]==0){
red++;
}else if(nums[i]==1){
white++;
}else{
blue++;
}
}
for(int i=0;i<nums.length;i++){
if(i<red){
nums[i]=0;
}else if(i< (red+white)){
nums[i]=1;
}else{
nums[i]=2;
}
}
```
​
One pass approach, the basic assumption is that all the 0 should move to the left using the low pointer, all the 2's should move to right using high pointer and during this process 1 automatically gets placed in the right place.
​
Start low at 0, index at 0, as soon as the number at index is 0, swap the value with value at low, if the number at index is 2, then swap the value with the value at high index, if value at index is 1 then just increment index and move on.
​
```
```
​