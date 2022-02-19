package datastructures.linkedlist;

import datastructures.linkedlist.Node;

import java.util.ArrayList;

public class LinkedList {
  Node head = null;

  public void insert(int value) {
    Node newHead = new Node(value);
    newHead.setNext(head);
    head = newHead;


  }

  public boolean includes(int value) {
    Node currentNode = head;
    while (currentNode != null){
      if (currentNode.getValue() == value){
        return true;
      } else {
        currentNode = currentNode.getNext();
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String stringBuilder = "";
    Node currentNode = head;
    while (currentNode != null){
      stringBuilder = stringBuilder + "{" + currentNode.getValue() + "} -> ";
      currentNode = currentNode.getNext();
    }
    String output = stringBuilder + "NULL";
    return output;
  }
}