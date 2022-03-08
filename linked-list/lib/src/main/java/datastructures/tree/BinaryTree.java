package datastructures.tree;

import datastructures.queue.Queue;

import java.util.ArrayList;


public class BinaryTree {

    public Node root;
    ArrayList<Integer> values = new ArrayList<>();
    int maximumValue;

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

    public void findMaxValue() throws Exception {
        if (root == null) {throw new Exception();}

        int maxValue = root.value;
        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);

        while(queue.size!=0){
            Node node = queue.dequeue();
            if (node.value > maxValue){
                maxValue = node.value;
            }
            if (node.leftNode != null){
                queue.enqueue(node.leftNode);
            }
            if (node.rightNode != null){
                queue.enqueue(node.rightNode);
            }
        }
        maximumValue = maxValue;
    }






}
