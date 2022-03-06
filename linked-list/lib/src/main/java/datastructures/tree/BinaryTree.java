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

    public ArrayList inOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        inOrder(this.root);
        return values;
    }


    private void inOrder(Node node) {
        if (node.leftNode != null){
            inOrder(node.leftNode);
        }
        values.add(node.value);
        if (node.rightNode != null){
            inOrder(node.rightNode);
        }
    }

    public ArrayList postOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        postOrder(this.root);
        return values;
    }

    private void postOrder(Node node) {
        if (node.leftNode != null){
            postOrder(node.leftNode);
        }
        if (node.rightNode != null){
            postOrder(node.rightNode);
        }
        values.add(node.value);
    }

}
