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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> levelorder=new ArrayList<>();
        if(root == null) return levelorder;
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            List <Integer> inner = new ArrayList<>();
            while(levelsize-- >0){
                TreeNode ele = q.remove();
                if(ele.left!=null){
                q.add(ele.left);
                }
                if(ele.right!=null){
                q.add(ele.right);
                }
                inner.add(ele.val);
            }
            levelorder.add(inner);
        }
        return levelorder;
    }
}