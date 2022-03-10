package datastructures.kTree;

import java.util.ArrayList;

public class Node<T> {
    public T value;
    public Node<T> parent;
    ArrayList<Node> children = new ArrayList<>();
    int kMaxChildren;


    public Node(T value, int kMaxChildren) {
        this.value = value;
        this.kMaxChildren = kMaxChildren;
    }

    public void addChild( Node<T> childNode) {
        if (children.size() < kMaxChildren) {
            children.add(childNode);
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public int getkMaxChildren() {
        return kMaxChildren;
    }

    public void setkMaxChildren(int kMaxChildren) {
        this.kMaxChildren = kMaxChildren;
    }
}

