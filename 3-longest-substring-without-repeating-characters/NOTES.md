The idea here is to use a sliding window, check if the character is present in hashmap,
* if no then put the character into the hashmap with its index and then check the length **```maxlength = max(maxlength, end-start+1)```**
* if the character is present in the hashmap, update the start, by moving the index by 1, **```start=max(start, map.get(character)+1)```**