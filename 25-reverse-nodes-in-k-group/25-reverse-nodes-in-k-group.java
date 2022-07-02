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
    ListNode th=null;
    ListNode tt=null;
    public int length(ListNode temp){
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void addFirstNode(ListNode node){
        if(th==null){
            th=node;
            tt=node;
        }else{
            node.next=th;
            th=node;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null ||k==1){
            return head;
        }
        ListNode oh=null,ot=null;
        int len=length(head);
        ListNode curr=head;
        while(len>=k){
            int tempL=k;
            while(tempL-->0){
                ListNode forw=curr.next;
                curr.next=null;
                addFirstNode(curr);
                curr=forw;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            tt=null;
            th=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
}