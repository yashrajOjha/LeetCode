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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();
        while(head!=null){
            ls.add(head.val);
            head=head.next;
        }
        ArrayList<Integer> rls= new ArrayList<>();
        for(int i=ls.size()-1;i>=0;i--){
            rls.add(ls.get(i));
            // System.out.println(ls.get(i));
        }
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)!=rls.get(i)){
                return false;
            }
        }
        return true;
    }
}