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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head,sec=head;
        ArrayList<Integer> al = new ArrayList<>();
        while(first!=null){
            al.add(first.val);
            // System.out.println(first.val);
            first=first.next;
        }
        int arr[] = new int[al.size()];
        for(int i = 0; i < al.size(); i++) arr[i] = al.get(i);
        int n =arr.length;
        int temp = arr[k-1];  
        arr[k-1] = arr[n-k];  
        arr[n-k] = temp; 
        int i=0;
        while(sec!=null){
            sec.val=arr[i];
            sec=sec.next;
            i++;
        }
        return head;
    }
}