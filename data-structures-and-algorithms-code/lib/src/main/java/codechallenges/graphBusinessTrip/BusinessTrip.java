package codechallenges.graphBusinessTrip;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import datastructures.queue.Queue;

import java.util.LinkedList;

public class BusinessTrip {


    public static <T extends Comparable<? super T>> String businessTrip(Graph<T> graph, String[] array) throws Exception {

        Queue<Vertex<T>> queue = new Queue<>();
        boolean isFound = true;
        int sum = 0;

        for (String s : array) {
            for (Vertex<T> tVertex : graph.getVertices()) {
                if (tVertex.value.equals(s)) {
                    queue.enqueue(tVertex);
                }
            }
        }
        while (queue.peek() != null || isFound) {
            Vertex<T> currentVertex = queue.dequeue();
            if (queue.size == 0) {
                break;
            }
            if (graph.adjacencyLists.contains(currentVertex)) {
                LinkedList<Edge<T>> list = graph.adjacencyLists.get(currentVertex);
                boolean isFoundTwo = false;
                for (Edge<T> edge : list) {
                    if (edge.destination.equals(queue.peek())) {
                        sum += edge.weight;
                        isFoundTwo = true;
                        break;
                    }
                }
                if (!isFoundTwo) {
                    isFound = false;
                    sum = 0;
                }
            } else {
                return null;
            }
        }
        if (!isFound) {
            sum = 0;
        }

        return isFound + ", " + sum + "$";
    }
}
