/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||head.next==null)return null;
        ListNode fast=head;
        ListNode slow=head;
        ListNode dummy=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=dummy){
                    dummy=dummy.next;
                    slow=slow.next;
                }
                return dummy;
            }
        }
        return null;
        
    }
}