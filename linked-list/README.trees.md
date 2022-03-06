# Trees

Implement a Binary and Binary Search Tree Classes with the following methods.
- Non Linear Data Structure
- Binary trees can have values of any type, but at most two children for each parent.
- BFS and DFS traversal. DFS - inOrder, PostOrder, PreOrder. 

## Challenge

### Create a Node class 

Has properties for the value stored in the node, the left child node, and the right child node.

### Create a Binary Tree class

Define a method for each of the depth first traversals:
- `pre order`
- `in order`
- `post order` 

### Create a Binary Search Tree Class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
- `Add`, Arguments: value, Return: nothing, Adds a new node with that value in the correct location in the binary search tree.
- `Contains`, Argument: value, Returns: boolean indicating whether or not the value is in the tree at least once.

## API

### Binary Tree

#### pre orderTraversal

- O(n) as the size of the tree grows, so does the run complexity. It has to visit every node one time.
- O(n) space could be larger if the depth of the tree is very high, reverse if width of tree is greater, causing extra space to be store in queue.
- `testPreOrderTraversal`

#### in orderTraversal

- O(n)
- If you apply inOrder on a BST, you will receive all the values in order. 
- `testInOrderTraversal`

#### post orderTraversal

- O(n)
- `testPostOrderTraversal`


### Binary Search Tree

#### Add (Insertion)
 - Inserts a value into the BST.
 - O(log n), as the size of the tree grows it can only increase by a certain amount. This is the best case. 
 - `testInsertBst`

#### Contains (Searching)
- Evaluates whether a certain value is found within the BST.
- O(log n), as the size of the tree grows it can only increase by a certain amount, with a relationship of log n. 
- `testContainsBst`
- `testNegativeContainsBst`

