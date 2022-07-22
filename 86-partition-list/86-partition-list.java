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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode leftTail = left;
        ListNode rightTail = right;
        
        while(head != null){ //put all the values values lesser than x to a leftail
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }
            else{ //put all the values greater than x to right tail
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next; //move the head 
        }
        
        leftTail.next = right.next; //doing this so end of the left tail points to starting of right 
        rightTail.next = null; //and righttail's next must be null and not pointing back to lefttail
        
        return left.next;
    }
}