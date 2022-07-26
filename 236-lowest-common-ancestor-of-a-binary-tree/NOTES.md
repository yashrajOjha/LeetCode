- If root is null or if root is x or if root is y then return root
- Made a recursion call for both on Left subtree and Right subtree
- If the left subtree recursive call gives a null value that means we haven’t found LCA in the left subtree, which means we found LCA on the right subtree. So we will return right.
- If the right subtree recursive call gives null value, that means we haven’t found LCA on the right subtree, which means we found LCA on the left subtree. So we will return left .
- If both left & right calls give values (not null) that means the root is the LCA.
​