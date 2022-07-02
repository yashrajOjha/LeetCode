/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head2 = headB;
        while(head2!=null){
            ListNode temp = headA;
            while(temp!=null){
                if(temp==head2) return head2;
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
}