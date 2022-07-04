/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node curr=head;
        Node newhead = new Node(-1);
        Node prev = newhead;
        while(curr!=null){
            Node node = new Node(curr.val);
            prev.next=node;
            //putting into hashmap
            map.put(curr, node);
            prev=prev.next;
            curr=curr.next;
        }
        newhead=newhead.next;
        // curr=head;
        Node c1 = head;
        Node c2 = newhead;
        while(c1!=null){
            c2.random = (c1.random!=null)?map.get(c1.random):null;
            c1=c1.next;
            c2=c2.next;
        }
        return newhead;
    }
}