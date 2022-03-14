package codechallenges.FizzBuzzTree;

import datastructures.kTree.KaryTree;
import datastructures.kTree.Node;

public class KaryTreeFizzBuzz {


    public static KaryTree<String> fizzBuzz(KaryTree<Integer> inputTree) throws Exception {
        if (inputTree.root == null) return null;
        return preOrder(inputTree.root, null);
    }

    private static KaryTree<String> preOrder(Node<Integer> intNode, Node<String> strNode) {
        KaryTree<String> strKTree = null;
        strNode = strNode;

        if (strNode == null) {
            if (intNode.value % 5 == 0 && intNode.value % 3 == 0){
                Node <String> newStrNode = new Node<>("Fizz Buzz", intNode.getkMaxChildren());
                strKTree = new KaryTree<>(intNode.getkMaxChildren(),newStrNode);
                strNode = newStrNode;
            }
            else if (intNode.value % 3 == 0){
                Node <String> newStrNode = new Node<>("Fizz", intNode.getkMaxChildren());
                strKTree = new KaryTree<>(intNode.getkMaxChildren(),newStrNode);
                strNode = newStrNode;
            }
            else if (intNode.value % 5 == 0){
                Node <String> newStrNode = new Node<>("Buzz", intNode.getkMaxChildren());
                strKTree = new KaryTree<>(intNode.getkMaxChildren(),newStrNode);
                strNode = newStrNode;
            }
            else {
                Node <String> newStrNode = new Node<>(Integer.toString(intNode.value), intNode.getkMaxChildren());
                strKTree = new KaryTree<>(intNode.getkMaxChildren(),newStrNode);
                strNode = newStrNode;
            }
        } else {
            if (intNode.value % 5 == 0 && intNode.value % 3 == 0){
                Node <String> newStrNode = new Node<>("Fizz Buzz", intNode.getkMaxChildren());
                strNode.addChild(newStrNode);
                strNode = newStrNode;
            }
            else if (intNode.value % 5 == 0){
                Node <String> newStrNode = new Node<>("Buzz", intNode.getkMaxChildren());
                strNode.addChild(newStrNode);
                strNode = newStrNode;
            }
            else if (intNode.value % 3 == 0){
                Node <String> newStrNode = new Node<>("Fizz", intNode.getkMaxChildren());
                strNode.addChild(newStrNode);
                strNode = newStrNode;
            }
            else {
                Node <String> newStrNode = new Node<>(Integer.toString(intNode.value), intNode.getkMaxChildren());
                strNode.addChild(newStrNode);
                strNode = newStrNode;
            }
        }

        if (intNode.getChildren() != null){
            for (Node node:intNode.getChildren()) {
                preOrder(node, strNode);
            }
        }

        return strKTree;
    }


}
