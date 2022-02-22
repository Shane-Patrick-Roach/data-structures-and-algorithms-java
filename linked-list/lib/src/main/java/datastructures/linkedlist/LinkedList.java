package datastructures.linkedlist;

import datastructures.linkedlist.Node;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class LinkedList {
  Node head = null;
  int size;

  public void insert(int value) {
    Node newHead = new Node(value);
    newHead.setNext(head);
    head = newHead;
  }

  public int size(){
    Node currentNode = head;
    int counter = 0;
    while (currentNode != null){
      counter++;
      currentNode=currentNode.getNext();
    }
    size = counter;
    return counter;
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

  public void append(int value){
    Node currentNode = head;
    while (currentNode != null){
      //System.out.println(currentNode);
      if (currentNode.getNext() == null){
        //System.out.println("i am here");
        Node newNextNode = new Node(value);
        newNextNode.setNext(null);
        currentNode.setNext(newNextNode);
        break;
      } else {
        currentNode = currentNode.getNext();
      }
    }
  }

  public void insertBefore(int value, int newValue){
    Node currentNode = head;
    while (currentNode != null){

      if (currentNode.getValue() == value){
        Node newInsertedNode = new Node(newValue);
        newInsertedNode.setNext(currentNode);
        head = newInsertedNode;
        break;
      }
      else if (currentNode.getNextValue() == value){
        Node newInsertedNode = new Node(newValue);
        newInsertedNode.setNext(currentNode.getNext());
        currentNode.setNext(newInsertedNode);
        break;
      } else {
        currentNode = currentNode.getNext();
      }
    }
  }

  public void insertAfter(int value, int newValue){
    Node currentNode = head;
    while (currentNode != null){
      if (currentNode.getValue() == value){
        Node newInsertNode = new Node(newValue);
        newInsertNode.setNext(currentNode.getNext());
        currentNode.setNext(newInsertNode);
        break;
      } else {
        currentNode = currentNode.getNext();
      }
    }
  }

  public int kthFromEnd(int k){
    try {
      Node currentNode = head;
      for (int i = 0; i < size; i++) {
        if (i == (size - abs(k) - 1)) {
          return currentNode.getValue();
        } else {
          currentNode = currentNode.getNext();
        }
      }
    } catch (Exception e){
      e.printStackTrace();
    }
    return 0;
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