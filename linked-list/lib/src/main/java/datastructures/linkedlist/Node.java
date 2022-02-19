package datastructures.linkedlist;

public class Node {

  private int value;
  private Node nextNode = null;

  Node(int value) {
    this.value = value;
  }

  public void setNext(Node node){
    nextNode = node;
  }

  public Node getNext(){
    return nextNode;
  }

  public int getValue(){
    return value;
  }

}