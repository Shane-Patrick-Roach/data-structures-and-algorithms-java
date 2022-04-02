# Graph

## Challenge

Implement a Graph. The graph should
be represented as an adjacency list, and includes the following methods; `addVertex`, `addEdge`, `getVertices`, `getNeighbors`, `getSize`.

## Methods and Efficiencies

### `addVertex` 
- Arguments: value
- Returns: The added node
- Add a node to the graph
- The big O runtime of adding a vertex is O(1).


### `addEdge`
- Arguments: 2 nodes to be connected by the edge, weight (optional)
- Returns: nothing
- Adds a new edge between two nodes in the graph
If specified, assign a weight to the edge
Both nodes should already be in the Graph
- The big O runtime of adding an edge is O(1).

### `getVertices`
- Arguments: none
- Returns all the vertices in the graph as a collection (set, list, or similar)
- The big O runtime of get vertices is O(n). n being the number of keys in the hash map.

### `getNeighbors`
- Arguments: node
- Returns a collection of edges connected to the given node
- Include the weight of the connection in the returned collection
- The big O runtime of get neighbors is O(m). m being the number of neighbors attached to the queried key.

### `size`
- Arguments: none
- Returns the total number of nodes in the graph
- The big O runtime of size is O(1).

## Tests

- `testGraphAddVertex`
- `testGraphAddVertexMultiple`
- `testGraphGetSize`
- `testGraphAddEdge`
- `testGraphAddEdgeOnNonExistingVertexException`
- `testGraphGetVertices`
- `testGraphGetVerticesDuplicates`
- `testGraphGetNeighbors`
- `testGraphGetNeighborsMultipleConnections`



## Notes

- A graph is a non-linear data structure that can be looked at as a 
collection of vertices (or nodes) potentially connected by line segments named edges
- An Undirected Graph is a graph where each edge is undirected or bi-directional. This means 
that the undirected graph does not move in any direction.
- A Directed Graph also called a Digraph is a graph where every edge is directed.

Unlike an undirected graph, a Digraph has direction. Each node is directed at another node with a 
specific requirement of what node should be referenced next.



## Resources/Citations
- Ed Younskevicius for starting code.
- [Graphs](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-35/resources/graphs.html)

