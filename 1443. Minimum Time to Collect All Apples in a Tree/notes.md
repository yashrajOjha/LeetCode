### [Question Link](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/description/)

There are three cases while collecting the total time taken,
* **Case 1**: where a parent 'a' has to ask child 'b' to see if there is any apple below it, so here total time would become, time taken by child b to collect from below it, and 2 more time steps to get back to parent 'a',
* **Case 2**: when a parent 'a' sees that its child 'b' already has an apple, so it collects from it and total time is 2,
* **Case 3**: when neither child has an apple, nor the parent, so naturally total time here is 0.

First to find out the linked nodes, we need to build a tree, meaning every node would have an adjacent node where it can go and come from, so we need to build that out, example node 0 would go to node 1 and node 2, so technically node 2 will go back to node 0, and so will node 1.

After building the adjacency list, we pass on root node to DFS,
* set time to 0,
* iterate through all the nodes available for the current node,
* ignore if the current node is going back to the parent node,
* then DFS to the next node, by curr node becoming child, parent becoming curr node, and also passing on the adjacency matrix,
* if hasApples for the child is true or if the time taken by child is non 0, then add it to the actual time along with +2 (going and coming back to the parent node for a child)

```
for(int child:map.getOrDefault(curr,new LinkedList<>())){
            if(child==parent) continue;
            int timefromchild = DFS(child, curr, map, hasApple);
            if(timefromchild>0 || hasApple.get(child)==true){
                time+=timefromchild+2;
            }
        }
```



