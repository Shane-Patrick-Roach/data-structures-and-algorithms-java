package codechallenges.businessTrip;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static codechallenges.graphbusinesstrip.BusinessTrip.businessTrip;

public class BusinessTripTest {

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





        sut.addEdge(vertexA,vertexB);
        sut.addEdge(vertexA,vertexE);

        String[] input = new String[]{"A","B"};


        businessTrip(sut, input);

    }



}
