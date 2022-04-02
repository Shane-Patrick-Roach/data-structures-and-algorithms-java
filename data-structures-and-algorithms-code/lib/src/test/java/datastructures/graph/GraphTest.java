package datastructures.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GraphTest {




    @Test
    void testGraphAddVertex() throws Exception {
        Graph<String> sut = new Graph<>(10);
        sut.addVertex("A");
        assert (sut.toString().equals("A: \n"));
    }


    @Test
    void testGraphAddVertexMultiple() throws Exception {
        Graph<String> sut = new Graph<>(10);
        sut.addVertex("A");
        sut.addVertex("B");
        sut.addVertex("C");
        assert (sut.toString().equals("""
                A:\s
                B:\s
                C:\s
                """));
    }


    @Test
    void testGraphGetSize() throws Exception {
        Graph<String> sut = new Graph<>(10);
        sut.addVertex("A");
        sut.addVertex("B");
        sut.addVertex("C");
        assert (sut.size() == 3);
    }


    @Test
    void testGraphAddEdge() throws Exception {
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");

        sut.addEdge(vertexA,vertexB,10);
        assert (sut.toString().equals("""
                A: B
                B: A
                """));
    }

    @Test
    void testGraphAddEdgeOnNonExistingVertexException() throws Exception {
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexC = new Vertex<>("C");

        assertThrows(Exception.class, () -> sut.addEdge(vertexA,vertexC,10));
    }


    @Test
    void testGraphGetVertices() throws Exception {
//            A
//        /       \
//       E         B
//        \       /
//         D  -  C

        Graph<String> sut = new Graph<>(10);
        sut.addVertex("A");
        sut.addVertex("B");
        sut.addVertex("C");
        sut.addVertex("D");
        sut.addVertex("E");
        assert (sut.getVertices().toString().equals("[E, A, B, C, D]"));
    }

    @Test
    void testGraphGetVerticesDuplicates() throws Exception {
//            A
//        /       \
//       E         B
//        \       /
//         D  -  C

        Graph<String> sut = new Graph<>(10);
        sut.addVertex("A");
        sut.addVertex("B");
        sut.addVertex("C");
        sut.addVertex("C");
        sut.addVertex("C");
        assert (sut.getVertices().toString().equals("[A, B, C]"));
    }



    @Test
    void testGraphGetNeighbors() throws Exception {

//            A
//        /       \
//       E         B
//        \       /
//         D  -  C
//                \
//                 F

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexF = sut.addVertex("F");

        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);

        sut.addEdge(vertexB,vertexC);

        sut.addEdge(vertexC,vertexD);

        sut.addEdge(vertexD,vertexE);

        sut.addEdge(vertexC,vertexF);

        assert (sut.getNeighbors(vertexF).toString().equals("[Destination: C, Weight: 0]"));
    }


    @Test
    void testGraphGetNeighborsMultipleConnections() throws Exception {

//            A
//        /       \
//       E         B
//        \       /
//         D  -  C
//                \
//                 F

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexF = sut.addVertex("F");

        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);

        sut.addEdge(vertexB,vertexC);

        sut.addEdge(vertexC,vertexD);

        sut.addEdge(vertexD,vertexE);

        sut.addEdge(vertexC,vertexF);

        assert (sut.getNeighbors(vertexC).toString().equals("[Destination: B, Weight: 0, Destination: D, Weight: 0, Destination: F, Weight: 0]"));
    }
}
