package datastructures.kTree;

import java.util.ArrayList;

public class KaryTree <T>{
    int k;
    public Node<T> root;
    ArrayList<T> values = new ArrayList<>();




    public KaryTree(int k, Node root) {
        this.k = k;
        this.root = root;
    }


    public ArrayList preOrderTraversal(){
        if (root == null){
            return null;
        }
        values = new ArrayList<>();
        preOrder(this.root);
        return values;
    }


    private void preOrder(Node<T> currentNode) {
        values.add(currentNode.getValue());
        if (currentNode.children != null){
            for(Node node : currentNode.getChildren()){
                preOrder(node);
            }
        }
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList<T> getValues() {
        return values;
    }

    public void setValues(ArrayList<T> values) {
        this.values = values;
    }
}
