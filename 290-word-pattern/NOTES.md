Add the character to hashmap, and start matching the index for each character in pattern and word in a string, ex:
* 'a' and 'dog' get an index of -1 initially, and then index is updated to i value (i ranges from 0 to length of pattern),
* 'b' and 'cat' get an index of -1, indexes are checked for inequality, if then the indexes are updated,
* the next time the character and string appears, then indexes must match if not then rejected.
​