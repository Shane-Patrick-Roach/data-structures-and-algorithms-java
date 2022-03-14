package datastructures.linkedlist;

public class Node {

  public int value;
  public Node nextNode = null;

  Node(int value) {
    this.value = value;
  }

  public void setNext(Node node){
    nextNode = node;
  }

  public Node getNext(){
    return nextNode;
  }

  public int getNextValue(){
    return nextNode.value;
  }

  public int getValue(){
    return value;
  }

}