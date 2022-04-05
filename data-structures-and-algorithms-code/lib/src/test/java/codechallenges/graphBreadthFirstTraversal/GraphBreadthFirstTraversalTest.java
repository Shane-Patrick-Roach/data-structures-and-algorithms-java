package codechallenges.graphBreadthFirstTraversal;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GraphBreadthFirstTraversalTest {


    @Test
    void testGraphBreathFirstTraversalShortestGraph() throws Exception {

//            A
//        /       \
//       E         B
//
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexD = sut.addVertex("D");


        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexD);


        System.out.println(sut.graphBreadthFirstTraverse(vertexA));
    }


    @Test
    void testGraphBreathFirstTraversalShortGraph() throws Exception {

//            A
//        /       \
//       E         B



        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");



        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexA,vertexB);


        assert(sut.graphBreadthFirstTraverse(vertexA).toString().equals("[A, E, B]"));
    }







    @Test
    void testGraphBreathFirstTraversalShortishGraph() throws Exception {

//
//            Z
//            |
//            A
//        /       \
//       E         B
//                    \
//                    D


        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexZ = sut.addVertex("Z");


        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexD);
        sut.addEdge(vertexA,vertexZ);


        assert (sut.graphBreadthFirstTraverse(vertexA).toString().equals("[A, B, E, Z, D]"));
    }

    @Test
    void testGraphBreathFirstTraversalDifferentStartingPoint() throws Exception {

//
//            Z
//            |
//            A
//        /       \
//       E         B
//                    \
//                    D


        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexZ = sut.addVertex("Z");


        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexD);
        sut.addEdge(vertexA,vertexZ);


        assert (sut.graphBreadthFirstTraverse(vertexZ).toString().equals("[Z, A, B, E, D]"));
    }


    @Test
    void testGraphBreathFirstTraversalMultipleConnections() throws Exception {

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


        assert(sut.graphBreadthFirstTraverse(vertexA).toString().equals("[A, B, E, C, D, F]"));
    }

    @Test
    void testGraphBreathFirstTraversalMultipleConnectionsTwo() throws Exception {
//         A
//          \
//            B
//        /       \
//       C    -   D
//      /  \    /
//     E -  F


        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("Pandora");
        Vertex<String> vertexB = sut.addVertex("Arendelle");
        Vertex<String> vertexC = sut.addVertex("Metroville");
        Vertex<String> vertexD = sut.addVertex("Monstropolis");
        Vertex<String> vertexE = sut.addVertex("Narnia");
        Vertex<String> vertexF = sut.addVertex("Naboo");

        sut.addEdge(vertexA,vertexB);


        sut.addEdge(vertexB,vertexC);
        sut.addEdge(vertexB,vertexD);

        sut.addEdge(vertexC,vertexD);

        sut.addEdge(vertexD,vertexF);

        sut.addEdge(vertexC,vertexF);

        sut.addEdge(vertexC,vertexE);

        sut.addEdge(vertexE,vertexF);


        assert(sut.graphBreadthFirstTraverse(vertexA).toString().equals("[Pandora, Arendelle, Metroville, Monstropolis, Naboo, Narnia]"));;
    }
}
