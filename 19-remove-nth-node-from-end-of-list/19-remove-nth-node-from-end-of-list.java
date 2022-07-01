/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count-=n;
        if(count==0) return head.next;
        int i=0;
        temp=head;
        while(temp!=null){
            i++;
            if(i==count){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
}