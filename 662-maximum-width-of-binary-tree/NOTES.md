Approach 1: Use of indexes,
<img src="https://github.com/yashrajOjha/random/blob/main/00b73c3e-5af2-4e8d-87c4-ddd5a3066dd3.jpg?raw=true" height="600" width="500">
​
```
public int widthOfBinaryTree(TreeNode root) {
if(root==null) return 0;
int maxW=0;
//storing a pair of number and the index for that node
Queue<Map.Entry<TreeNode, Integer>> q= new LinkedList<Map.Entry<TreeNode, Integer>>();
q.offer( new AbstractMap.SimpleEntry(root,1));
//traversing throught the queue until it is empty
while(!q.isEmpty()){
int l =q.peek().getValue(),r=l;
for(int i=0;i<q.size();i++){
TreeNode node = q.peek().getKey();
r = q.poll().getValue(); //get the first element
if(node.left!=null) q.offer(new AbstractMap.SimpleEntry(node.left,r*2));
if(node.right!=null) q.offer(new AbstractMap.SimpleEntry(node.right, r*2+1));
}
maxW = Math.max(maxW,r-l+1); //subtracting the available indexes
}
return maxW;
}
```