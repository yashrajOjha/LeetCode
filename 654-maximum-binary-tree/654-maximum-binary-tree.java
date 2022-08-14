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
    public TreeNode func(int nums[], int start, int end){
        if(start>end)return null;
        
        int ind=start;
        for(int i=start+1;i<=end;i++){
            if(nums[i]>nums[ind]) ind=i;
        }
        
        TreeNode root = new TreeNode(nums[ind]);
        root.left= func(nums,start,ind-1);
        root.right= func(nums,ind+1,end);
        
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null) return null;
        return func(nums,0,nums.length-1);
    }
}