package datastructures.graph;

import datastructures.hashmap.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;

    public Graph(int maxNumberOfVertices) {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(T value) {
        Vertex<T> newNode = new Vertex<>(value);
        adjacencyLists.set(newNode, new LinkedList<Edge<T>>());
        numberOfVertices++;
        return newNode;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination) throws Exception {
        addEdge(start, destination, 0);
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) throws Exception {
        if (!adjacencyLists.contains(start) && adjacencyLists.contains(destination))
            throw new Exception("Specified Vertices are not in Graph");

        Edge<T> newEdgeOne = new Edge<>(destination, weight);
        LinkedList<Edge<T>> listToUpdateOne = adjacencyLists.get(start);
        listToUpdateOne.add(newEdgeOne);

        Edge<T> newEdgeTwo = new Edge<>(start, weight);
        LinkedList<Edge<T>> listToUpdateTwo = adjacencyLists.get(destination);
        listToUpdateTwo.add(newEdgeTwo);

    }

    public List<Vertex<T>> getVertices()  // getNodes()
    {
        List<Vertex<T>> nodes = adjacencyLists.keys();
        return nodes;
    }

    public List<Edge<T>> getNeighbors(Vertex<T> vertex) {

        ArrayList<Edge<T>> listOfNeighbors = new ArrayList<>();
        LinkedList<Edge<T>> currentKeyEdgeList = adjacencyLists.get(vertex);
        listOfNeighbors.addAll(currentKeyEdgeList);

        return listOfNeighbors;
    }

    public int size() {
        return numberOfVertices;
    }

    @Override
    public int compareTo(Graph<T> o) {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString() {

        String stringBuilder = "";

        List <Vertex<T>> keysList = adjacencyLists.keys();
        for (Vertex<T> key : keysList){
            String newString = key.value.toString()+": ";

            LinkedList<Edge<T>> currentKeyEdgeList = adjacencyLists.get(key);
            for (Edge<T> edge : currentKeyEdgeList){

               newString += edge.destination.value.toString();

            }
            stringBuilder += newString + "\n";
        }

        return stringBuilder;
    }
}