# Challenge Summary

Implement a breadth-first traversal on a graph.

`Arguments`: Node (vertex)

`Return`: A collection of nodes in the order they were visited.

## Whiteboard Process
![Code Challenge 33 Diagram](../lib/images/Java_CodeChallenge36.png)

## Approach and Efficiency

The approach I took was to implement a queue and a hashmap to traverse breadth-wise through the graph. To start, the vertex entered as an argument
was enqueued. Then while the queue was populated, the current node was added to the returned collection, and each of its edge nodes were enqueued. To 
account for the fact of repeats, each node was also added to hashmap. Before a node was enqueued it was validated to not be present in the hashmap.


The big O runtime efficiency is O(n). The runtime grows in proportion to the size of the graph. Every node has to be visited.
The big O space efficiency is approximately O(n), since a new arraylist of values must be generated. Additional memory is also allocated to the queue.

## Solution

- `testGraphBreathFirstTraversalShortestGraph`
- `testGraphBreathFirstTraversalShortGraph`
- `testGraphBreathFirstTraversalShortishGraph`
- `testGraphBreathFirstTraversalDifferentStartingPoint`
- `testGraphBreathFirstTraversalMultipleConnections`
- `testGraphBreathFirstTraversalMultipleConnectionsTwo`
