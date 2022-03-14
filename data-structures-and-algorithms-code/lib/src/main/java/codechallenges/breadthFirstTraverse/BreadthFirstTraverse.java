package codechallenges.breadthFirstTraverse;

import datastructures.queue.Queue;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

import java.util.ArrayList;

public class BreadthFirstTraverse {

    public static ArrayList <Integer> breadthFirstTraverse(BinaryTree tree) throws Exception {
        if (tree.root == null){return null;}
        ArrayList <Integer> list = new ArrayList<>();
        Queue <Node> queue = new Queue<>();
        queue.enqueue(tree.root);

        while (queue.size != 0){
            Node currentNode = queue.dequeue();
            list.add(currentNode.getValue());
            if (currentNode.getLeftNode() != null){
                queue.enqueue(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null){
                queue.enqueue(currentNode.getRightNode());
            }
        }
        return list;
    }

}
