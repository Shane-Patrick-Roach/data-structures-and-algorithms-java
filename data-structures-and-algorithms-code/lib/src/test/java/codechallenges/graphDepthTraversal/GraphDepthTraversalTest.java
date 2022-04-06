package codechallenges.graphDepthTraversal;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GraphDepthTraversalTest {


    @Test
    void testGraphDepthTraversalShortestGraph() throws Exception {

//            A
//        /       \
//       E         B
//                  |
//                  C

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexC = sut.addVertex("C");



        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexC);

        assert (sut.graphDepthPreOrderTraversal(vertexA,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[A, B, C, E]"));
    }



    @Test
    void testGraphDepthTraversalMediumGraph() throws Exception {


//            D - W
//            |
//            A
//        /       \
//       E         B
//                  |
//                  C

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexW = sut.addVertex("W");

        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexC);
        sut.addEdge(vertexA,vertexD);
        sut.addEdge(vertexD,vertexW);

        assert (sut.graphDepthPreOrderTraversal(vertexA,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[A, B, C, E, D, W]"));
    }


    @Test
    void testGraphDepthTraversalMediumGraphMultipleEdges() throws Exception {

//            D - W
//            | /
//            A
//        /       \
//       E    -     B
//                  |
//                  C

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexW = sut.addVertex("W");

        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexC);
        sut.addEdge(vertexA,vertexD);
        sut.addEdge(vertexD,vertexW);
        sut.addEdge(vertexE,vertexB);
        sut.addEdge(vertexA,vertexW);

        assert (sut.graphDepthPreOrderTraversal(vertexA,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[A, B, C, E, D, W]"));
    }



    @Test
    void testGraphDepthTraversalLongGraphMultipleEdges() throws Exception {

//            D - W
//            | /
//            A
//        /       \
//       E    -     B - Q - M
//       |          |  /
//       Z           C

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexW = sut.addVertex("W");
        Vertex<String> vertexZ = sut.addVertex("Z");
        Vertex<String> vertexQ = sut.addVertex("Q");
        Vertex<String> vertexM = sut.addVertex("M");


        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexC);
        sut.addEdge(vertexA,vertexD);
        sut.addEdge(vertexD,vertexW);
        sut.addEdge(vertexE,vertexB);
        sut.addEdge(vertexA,vertexW);
        sut.addEdge(vertexB,vertexQ);
        sut.addEdge(vertexQ,vertexM);
        sut.addEdge(vertexQ,vertexC);
        sut.addEdge(vertexE,vertexZ);

        assert (sut.graphDepthPreOrderTraversal(vertexA,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[A, B, C, Q, M, E, Z, D, W]"));
    }

    @Test
    void testGraphDepthTraversalLongGraphMultipleEdgesDifferentStartingPoint() throws Exception {

//            D - W
//            | /
//            A
//        /       \
//       E    -     B - Q - M
//       |          |  /
//       Z           C

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");
        Vertex<String> vertexC = sut.addVertex("C");
        Vertex<String> vertexD = sut.addVertex("D");
        Vertex<String> vertexW = sut.addVertex("W");
        Vertex<String> vertexZ = sut.addVertex("Z");
        Vertex<String> vertexQ = sut.addVertex("Q");
        Vertex<String> vertexM = sut.addVertex("M");


        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);
        sut.addEdge(vertexB,vertexC);
        sut.addEdge(vertexA,vertexD);
        sut.addEdge(vertexD,vertexW);
        sut.addEdge(vertexE,vertexB);
        sut.addEdge(vertexA,vertexW);
        sut.addEdge(vertexB,vertexQ);
        sut.addEdge(vertexQ,vertexM);
        sut.addEdge(vertexQ,vertexC);
        sut.addEdge(vertexE,vertexZ);


        assert (sut.graphDepthPreOrderTraversal(vertexC,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[C, B, A, E, Z, D, W, Q, M]"));
    }


    @Test
    void testGraphDepthTraversalSingleVertex() throws Exception {

//            A

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");

        assert (sut.graphDepthPreOrderTraversal(vertexA,new ArrayList<>(),new HashMap<>(sut.size())).toString().equals("[A]"));
    }

}
