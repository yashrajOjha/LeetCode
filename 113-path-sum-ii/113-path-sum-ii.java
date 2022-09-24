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
    List<List<Integer>> res = new ArrayList<>();
    public void func(TreeNode root, int targetSum,List<Integer> list){
         if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val)
            res.add(new ArrayList(list));
        func(root.left, targetSum - root.val, list);
        func(root.right, targetSum - root.val, list);
        list.remove(list.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return res;
        func(root,targetSum,new ArrayList<>());
        return res;
    }
}