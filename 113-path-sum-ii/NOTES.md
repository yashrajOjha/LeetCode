public void func(TreeNode root, int targetSum,List<Integer> list){
if (root == null) return;
list.add(root.val);
if (root.left == null && root.right == null && targetSum == root.val)
res.add(new ArrayList(list));
func(root.left, targetSum - root.val, list);
func(root.right, targetSum - root.val, list);
list.remove(list.size() - 1);
}