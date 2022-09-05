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
    public boolean func(TreeNode left, TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val!=right.val) return false;
        return func(left.left,right.right) && func(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode node) {
        if(node==null) return true;
        return func(node.left, node.right);
    }
}