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
    public int getHeightLeft(TreeNode root){
        int count=0;
        while(root.left!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    public int getHeightRight(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root=root.right;
        }
        return count;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = getHeightLeft(root);
        int right = getHeightRight(root);
        if(left==right) return (2<<left)-1; 
        //when both the sides height is same, then its a full binary tree and height can be computed through 2powerh-1
        else return 1+countNodes(root.left)+countNodes(root.right); //if the heights are unequal then count that node and move on to the next level to see heights
    }
}