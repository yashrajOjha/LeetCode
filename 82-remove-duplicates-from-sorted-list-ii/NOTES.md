* We use fast and slow pointers,
* fast pointer is to check if the current and next value is same or not if yes then move on,
* so technically it is used to delete the duplicates,
*   then we check if the slow.next is not same as fast, make slow.next as fast.next, and fast as slow.next
*   if there are no duplicates just move the slow and fast pointer.