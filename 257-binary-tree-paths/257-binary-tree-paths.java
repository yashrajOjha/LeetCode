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
    List<String> res = new ArrayList<>();
    public void func(TreeNode root, String s){
        if(root==null) return;
        
        s+=String.valueOf(root.val);
        if(root.left==null && root.right==null){
            res.add(s);
            return;
        }
        func(root.left,s+"->");
        func(root.right,s+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        func(root,"");
        return res;
    }
}