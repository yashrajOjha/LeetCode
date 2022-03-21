Brute Force:
* start checking for the max index of a character, traverse until the character's index if its the same, then add the index to the list,
```
if(s.charAt(i)==s.charAt(j)){
maxIndex = Math.max(maxIndex, j);
}
```
* make index to be subtracted from next sequence as the current i value
```
if(i==maxIndex){
res.add(maxIndex-index);
index=i;
```
* make maxIndex as index obtained for recent partition as the current i value.
```
maxIndex=i;
```