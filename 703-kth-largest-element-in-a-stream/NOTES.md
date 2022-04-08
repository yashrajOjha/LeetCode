We can build a MinHeap that contains only k largest elements.
On add:
* compare a new element x with min to decide if we should pop min and insert x
* take into account a case when heap_size is less than k
* Construction is simply calling the add function N times