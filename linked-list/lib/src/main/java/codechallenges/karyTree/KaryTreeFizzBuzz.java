package codechallenges.karyTree;

import datastructures.kTree.KaryTree;
import datastructures.kTree.Node;

public class KaryTreeFizzBuzz {

    KaryTree<String> outputTree;

    public KaryTree<String> fizzBuzz(KaryTree<Integer> inputTree){

        KaryTree<String> outputTree = new KaryTree<>(inputTree.getK(),null);
        preOrder(inputTree.root);

    }

    private void preOrder(Node<Integer> inputCurrentNode){
        Node<String> previousNode;


        if (outputTree.root == null) {

            if (inputCurrentNode.getValue() % 5 == 0) {
                Node<String> outputNode = new Node<>("Fizz", 3);
                outputTree.setRoot(outputNode);
                previousNode =outputNode;
            } else if (inputCurrentNode.getValue() % 3 == 0) {
                Node<String> outputNode = new Node<>("Buzz", 3);
                outputTree.setRoot(outputNode);
                previousNode =outputNode;
            } else if (inputCurrentNode.getValue() % 3 == 0 && inputCurrentNode.getValue() % 5 == 0) {
                Node<String> outputNode = new Node<>("Fizz Buzz", 3);
                outputTree.setRoot(outputNode);
                previousNode =outputNode;
            } else {
                Node<String> outputNode = new Node<>(inputCurrentNode.getValue().toString(), 3);
                outputTree.setRoot(outputNode);
                previousNode = outputNode;
            }
        } else {
                if (inputCurrentNode.getValue() % 5 == 0) {
                    Node<String> outputNode = new Node<>("Fizz", 3);
                    if (previosNode != null) {
                        previosNode.addChild(outputNode);
                    }
                } else if (inputCurrentNode.getValue() % 3 == 0) {
                    Node<String> outputNode = new Node<>("Buzz", 3);
                    if (previosNode != null) {
                        previosNode.addChild(outputNode);
                    }
                } else if (inputCurrentNode.getValue() % 3 == 0 && inputCurrentNode.getValue() % 5 == 0) {
                    Node<String> outputNode = new Node<>("Fizz Buzz", 3);
                    if (previosNode != null) {
                        previosNode.addChild(outputNode);
                    }
                } else {
                    Node<String> outputNode = new Node<>(inputCurrentNode.getValue().toString(), 3);
                    if (previosNode != null) {
                        previosNode.addChild(outputNode);
                    }
                }
                for (Node childrenNode : inputCurrentNode.getChildren()) {
                    preOrder(childrenNode);
                }

            }
        }


}
