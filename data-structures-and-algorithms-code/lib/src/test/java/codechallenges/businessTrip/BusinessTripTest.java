package codechallenges.businessTrip;

import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import static codechallenges.graphBusinessTrip.BusinessTrip.businessTrip;

public class BusinessTripTest {

    @Test
    void testGraphBusinessTripTravelBetweenTwoPoints() throws Exception {

//            A
//        /       \
//       E         B
//
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");


        sut.addEdge(vertexA, vertexB, 87);
        sut.addEdge(vertexA, vertexE);

        String[] input = new String[]{"A", "B"};

        assert (businessTrip(sut, input).equals("true, 87$"));
    }


    @Test
    void testGraphBusinessTripTravelBetweenThreePoints() throws Exception {

//            A
//             \
//               B
//                 \
//                  E
//
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");

        sut.addEdge(vertexA, vertexB, 87);
        sut.addEdge(vertexB, vertexE, 30);

        String[] input = new String[]{"A", "B", "E"};


        assert (businessTrip(sut, input).equals("true, 117$"));

    }


    @Test
    void testGraphBusinessTripNonExistingPaths() throws Exception {

//            A
//        /       \
//       E         B
//
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");

        sut.addEdge(vertexA, vertexB, 87);
        sut.addEdge(vertexB, vertexE, 30);

        String[] input = new String[]{"A", "E"};

        assert (businessTrip(sut, input).equals("false, 0$"));
    }


    @Test
    void testGraphBusinessTripRoundTrip() throws Exception {

//            A
//    30  /       \ 22
//
//       E    -     B
//           100
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");

        sut.addEdge(vertexA, vertexB, 22);
        sut.addEdge(vertexB, vertexA, 22);
        sut.addEdge(vertexB, vertexE, 30);
        sut.addEdge(vertexE, vertexB, 30);
        sut.addEdge(vertexA, vertexE, 100);
        sut.addEdge(vertexE, vertexA, 100);

        String[] input = new String[]{"A", "E", "B","A","E"};

        assert (businessTrip(sut, input).equals("true, 252$"));
    }

    @Test
    void testGraphBusinessTripFirstTripExistsSecondDoesNot() throws Exception {

//            A
//    30  /       \ 22
//
//       E    -     B
//           100
        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");

        sut.addEdge(vertexA, vertexB, 22);
        sut.addEdge(vertexB, vertexE, 30);


        String[] input = new String[]{"A", "E", "B"};

        assert (businessTrip(sut, input).equals("false, 0$"));
    }


    @Test
    void testGraphBusinessTripFirstTripRepeatedValues() throws Exception {

//            A
//    30  /       \ 22
//
//       E    -     B
//           100

        Graph<String> sut = new Graph<>(10);
        Vertex<String> vertexA = sut.addVertex("A");
        Vertex<String> vertexB = sut.addVertex("B");
        Vertex<String> vertexE = sut.addVertex("E");

        sut.addEdge(vertexA, vertexB, 22);
        sut.addEdge(vertexB, vertexA, 22);
        sut.addEdge(vertexB, vertexE, 30);
        sut.addEdge(vertexE, vertexB, 30);


        String[] input = new String[]{"A", "A", "B"};

        assert (businessTrip(sut, input).equals("false, 0$"));
    }



    @Test
    void testGraphBusinessTripCCDocumentationSampleOne() throws Exception {

//                              A
//                      30  /       \ 22
//
//                         E    -     B
//                              100

        Graph<String> sut = new Graph<>(10);


        Vertex<String> vertexPandora = sut.addVertex("Pandora");
        Vertex<String> vertexArendelle = sut.addVertex("Arendelle");
        Vertex<String> vertexMeteorville = sut.addVertex("Meteorville");
        Vertex<String> vertexMonstropolis = sut.addVertex("Monstropolis");
        Vertex<String> vertexNaboo= sut.addVertex("Naboo");
        Vertex<String> vertexNarnia = sut.addVertex("Narnia");



        sut.addEdge(vertexPandora, vertexArendelle, 150);
        sut.addEdge(vertexPandora, vertexMeteorville, 82);
        sut.addEdge(vertexMeteorville, vertexArendelle, 99);
        sut.addEdge(vertexArendelle, vertexMonstropolis, 42);
        sut.addEdge(vertexMeteorville, vertexMonstropolis, 105);
        sut.addEdge(vertexMeteorville, vertexNarnia, 37);
        sut.addEdge(vertexMeteorville, vertexNaboo, 26);
        sut.addEdge(vertexNarnia, vertexNaboo, 250);
        sut.addEdge(vertexMonstropolis, vertexNaboo, 73);

        String[] input = new String[]{"Meteorville", "Pandora"};

        assert (businessTrip(sut, input).equals("true, 82$"));
        System.out.println(businessTrip(sut, input));
    }


    @Test
    void testGraphBusinessTripCCDocumentationSampleTwo() throws Exception {

//                              A
//                      30  /       \ 22
//
//                         E    -     B
//                              100

        Graph<String> sut = new Graph<>(10);


        Vertex<String> vertexPandora = sut.addVertex("Pandora");
        Vertex<String> vertexArendelle = sut.addVertex("Arendelle");
        Vertex<String> vertexMeteorville = sut.addVertex("Meteorville");
        Vertex<String> vertexMonstropolis = sut.addVertex("Monstropolis");
        Vertex<String> vertexNaboo= sut.addVertex("Naboo");
        Vertex<String> vertexNarnia = sut.addVertex("Narnia");



        sut.addEdge(vertexPandora, vertexArendelle, 150);
        sut.addEdge(vertexPandora, vertexMeteorville, 82);
        sut.addEdge(vertexMeteorville, vertexArendelle, 99);
        sut.addEdge(vertexArendelle, vertexMonstropolis, 42);
        sut.addEdge(vertexMeteorville, vertexMonstropolis, 105);
        sut.addEdge(vertexMeteorville, vertexNarnia, 37);
        sut.addEdge(vertexMeteorville, vertexNaboo, 26);
        sut.addEdge(vertexNarnia, vertexNaboo, 250);
        sut.addEdge(vertexMonstropolis, vertexNaboo, 73);

        String[] input = new String[]{"Arendelle", "Monstropolis", "Naboo"};

        assert (businessTrip(sut, input).equals("true, 115$"));
        System.out.println(businessTrip(sut, input));
    }


    @Test
    void testGraphBusinessTripCCDocumentationSampleThree() throws Exception {

//                              A
//                      30  /       \ 22
//
//                         E    -     B
//                              100

        Graph<String> sut = new Graph<>(10);


        Vertex<String> vertexPandora = sut.addVertex("Pandora");
        Vertex<String> vertexArendelle = sut.addVertex("Arendelle");
        Vertex<String> vertexMeteorville = sut.addVertex("Meteorville");
        Vertex<String> vertexMonstropolis = sut.addVertex("Monstropolis");
        Vertex<String> vertexNaboo= sut.addVertex("Naboo");
        Vertex<String> vertexNarnia = sut.addVertex("Narnia");



        sut.addEdge(vertexPandora, vertexArendelle, 150);
        sut.addEdge(vertexPandora, vertexMeteorville, 82);
        sut.addEdge(vertexMeteorville, vertexArendelle, 99);
        sut.addEdge(vertexArendelle, vertexMonstropolis, 42);
        sut.addEdge(vertexMeteorville, vertexMonstropolis, 105);
        sut.addEdge(vertexMeteorville, vertexNarnia, 37);
        sut.addEdge(vertexMeteorville, vertexNaboo, 26);
        sut.addEdge(vertexNarnia, vertexNaboo, 250);
        sut.addEdge(vertexMonstropolis, vertexNaboo, 73);

        String[] input = new String[]{"Naboo", "Pandora"};

        assert (businessTrip(sut, input).equals("false, 0$"));
    }


    @Test
    void testGraphBusinessTripCCDocumentationSampleFour() throws Exception {

//                              A
//                      30  /       \ 22
//
//                         E    -     B
//                              100

        Graph<String> sut = new Graph<>(10);


        Vertex<String> vertexPandora = sut.addVertex("Pandora");
        Vertex<String> vertexArendelle = sut.addVertex("Arendelle");
        Vertex<String> vertexMeteorville = sut.addVertex("Meteorville");
        Vertex<String> vertexMonstropolis = sut.addVertex("Monstropolis");
        Vertex<String> vertexNaboo= sut.addVertex("Naboo");
        Vertex<String> vertexNarnia = sut.addVertex("Narnia");



        sut.addEdge(vertexPandora, vertexArendelle, 150);
        sut.addEdge(vertexPandora, vertexMeteorville, 82);
        sut.addEdge(vertexMeteorville, vertexArendelle, 99);
        sut.addEdge(vertexArendelle, vertexMonstropolis, 42);
        sut.addEdge(vertexMeteorville, vertexMonstropolis, 105);
        sut.addEdge(vertexMeteorville, vertexNarnia, 37);
        sut.addEdge(vertexMeteorville, vertexNaboo, 26);
        sut.addEdge(vertexNarnia, vertexNaboo, 250);
        sut.addEdge(vertexMonstropolis, vertexNaboo, 73);

        String[] input = new String[]{"Narnia", "Arendelle", "Naboo"};

        assert (businessTrip(sut, input).equals("false, 0$"));
    }
}
