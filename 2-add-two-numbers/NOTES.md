Here the idea is to make a new dummy node and create a temp, use while until l1 is not null or l2 is not null or carry ==1, make sum as 0, if l1!=null add its value to the sum and move l1 to next node, if l2!=null add its value to the sum and move l2 to next node, also add carry to the sum. Carry becomes sum/10, and sum%10 is added as a new node, move the temp pointer, and return dummy.next.
```java
sum+=carry;
carry=sum/10;
ListNode node = new ListNode(sum%10);
temp.next=node;
temp=temp.next;
```