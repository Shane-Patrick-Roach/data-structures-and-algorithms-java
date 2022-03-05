package datastructures.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree {

    Node root;
    ArrayList<Integer> values = new ArrayList<>();

    public ArrayList preOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        preOrder(this.root);
        return values;
    }


    private void preOrder(Node node) {
        values.add(node.value);
        if (node.leftNode != null){
            preOrder(node.leftNode);
        }
        if (node.rightNode != null){
            preOrder(node.rightNode);
        }
    }

    public Integer[] inOrderTraversal(){
        Integer[] outputValues = null;

        return outputValues;
    }

    public Integer[] postOrderTraversal(){
        Integer[] outputValues = null;

        return outputValues;
    }

}
