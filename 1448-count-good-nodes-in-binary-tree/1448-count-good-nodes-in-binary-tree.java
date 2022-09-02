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
    int count=0;
    public void dfs(TreeNode node, int maxVal){
        if(node!=null){
            if(node.val>=maxVal){
            maxVal = Math.max(maxVal,node.val);
            count++;
            }
            dfs(node.left,maxVal);
            dfs(node.right,maxVal);
        }
    }
    public int goodNodes(TreeNode root) {
        // dfs(root,root.val);
        if(root.left==null && root.right==null) count=1;
        else{ dfs(root,root.val); }
        return count;
    }
}