# Challenge Summary
Write a function to find common values in 2 binary trees.

`Arguments`: Two binary trees

`Return`: Collection of common values

## Whiteboard Process
![Code Challenge 32 Diagram](../lib/images/Java_CodeChallenge32.png)

## Approach and Efficiency

The approach included using the previous constructed hashmap data-structure. To hold the common values, a new arraylist was created. Lists were also created to
hold each node in each binary tree by preOrderTraversal. The list of `Tree One` values was added to the hashmap, and then each value in `Tree Two` was compared to the hashmap to see if
it was already present. If the hashmap did contain the value, it was added to the returned result list array. 

The runtime efficiency big O is o(2n + 2m) which approximates to o(n + m). This is because we have to traverse each of the input trees and also iterate through them again. This grows with the input size of each binary tree.
The space efficiency big O is o(n + m) with additional space being allocated to the list of values generated from the tree traversal.

## Solution

- `testTreeIntersection`
- `testTreeIntersectionSameTree`
- `testTreeIntersectionNoMatches`

