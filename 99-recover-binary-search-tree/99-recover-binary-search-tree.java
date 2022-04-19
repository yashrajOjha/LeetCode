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
    ArrayList<Integer> arr = new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
        inOrderAdd(root);
        Collections.sort(arr);
        inOrderCorrect(root);
    }
    public void inOrderCorrect(TreeNode root){
        if(root==null) return;
        inOrderCorrect(root.left);
        root.val = arr.get(i++);
        inOrderCorrect(root.right);
        
    }
    public void inOrderAdd(TreeNode root){
        if(root==null) return;
        inOrderAdd(root.left);
        arr.add(root.val);
        inOrderAdd(root.right);
    }
}