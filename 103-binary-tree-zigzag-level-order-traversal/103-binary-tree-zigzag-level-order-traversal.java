/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> op = new LinkedList<>();
        if(root==null){
            return op;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean odd=true;
        while(!queue.isEmpty()) {
           int size = queue.size();
           LinkedList<Integer> res = new LinkedList<>();
           for(int i=1;i<=size;i++){
               TreeNode node = queue.poll();
               if(odd){
                   res.add(node.val);   
               } else {
                   res.addFirst(node.val);
               }
               if(node.left!=null) {
                       queue.add(node.left);
               }
            if(node.right!=null){
                        queue.add(node.right);
                   }
               
           }
            op.add(res);
            odd=!odd;
        }
        return op;
    }
}