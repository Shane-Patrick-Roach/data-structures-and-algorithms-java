package codechallenges.graphbusinesstrip;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import datastructures.queue.Queue;


import java.util.ArrayList;
import java.util.LinkedList;

public class BusinessTrip {


//    public static <T extends Comparable<? super T>> String businessTrip(Graph<T> graph, String[] array) throws Exception {
//
//        Queue<Vertex<T>> queue = new Queue<>();
//        boolean isFound = true;
//        int sum = 0;
//
//        for (String s : array) {
//            for (Vertex<T> tVertex : graph.getVertices()) {
//                if (tVertex.value.equals(s)) {
//                    queue.enqueue(tVertex);
//                }
//            }
//        }
//
//        while (queue.size != 0 || isFound){
//            Vertex<T> currentVertex = queue.dequeue();
//            if (graph.adjacencyLists.contains(currentVertex)){
//                LinkedList<Edge<T>> list = graph.adjacencyLists.get(currentVertex);
//                boolean isFoundTwo = false;
//                for (Edge<T> edge : list){
//                    if(edge.destination.value.equals(queue.peek())){
//                        sum += edge.weight;
//                        isFoundTwo = true;
//                        break;
//                    }
//                }
//                if(!isFoundTwo){
//                    isFound = false;
//                }
//            } else {
//            return null;
//            }
//        }
//
//
//        return isFound + ", " + sum + "$";
//    }


    public static <T extends Comparable<? super T>> String businessTrip(Graph<T> graph, String[] array) throws Exception {

        Queue<Vertex<T>> queue = new Queue<>();
        boolean isFound = true;
        int sum = 0;
        ArrayList<Vertex<T>> listOfString = new ArrayList<>();

        for (String s : array) {
            for (Vertex<T> tVertex : graph.getVertices()) {
                if (tVertex.value.equals(s)) {
                    listOfString.add(tVertex);
                }
            }
        }


        System.out.println(listOfString.toString());

        while (listOfString.size() > 2 || isFound) {
            Vertex<T> currentVertex = listOfString.get(0);

            LinkedList<Edge<T>> list = graph.adjacencyLists.get(currentVertex);
            boolean isFoundTwo = false;
            for (Edge<T> edge : list) {
                if (edge.destination.equals(listOfString.get(1))) {
                    sum += edge.weight;
                    isFoundTwo = true;
                    listOfString.remove(0);
                    break;
                }
            }
            if (!isFoundTwo) {
                isFound = false;
            }

        }


        return isFound + ", " + sum + "$";
    }
}
