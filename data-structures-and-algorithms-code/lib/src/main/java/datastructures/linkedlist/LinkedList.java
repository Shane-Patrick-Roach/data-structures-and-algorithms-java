package datastructures.linkedlist;

import static java.lang.Math.abs;

public class LinkedList <T>{
  Node<T> head = null;
  Node<T> tail = null;
  int size;



  public Boolean isPalindrome(LinkedList<T> list){
    LinkedList<T> list1 = list;
    LinkedList<T> list2 = list.reverse();

    Node<T> currentNodeList1 = list1.head;
    Node<T> currentNodeList2 = list2.head;

    while (currentNodeList1 != null || currentNodeList2 != null){
      if (currentNodeList1.value == currentNodeList2.value){
        currentNodeList1 = currentNodeList1.getNext();
        currentNodeList2 = currentNodeList2.getNext();
      } else {
        return false;
      }

    }

    return true;

  }


//  public LinkedList removeSecondFromEnd(LinkedList list){
//
//
//    Node currentNode = head;
//
//    for(int i = 1; i < size; i++){
//
//      if(i == size - 2){
//        currentNode.setNext(null);
//        break;
//      }
//      currentNode = currentNode.nextNode;
//    }
//
//    return list;
//  }


  public LinkedList removeSecondFromEnd(LinkedList list){


    Node currentNode = head;

    while(currentNode != null){

      if(currentNode.getNext().getNext() == null){
        currentNode.setNext(null);
        break;
      }
      currentNode = currentNode.nextNode;
    }
    System.out.println("Im here");

    return list;
  }



  public LinkedList reverse(){
    LinkedList reversedLinkedList = new LinkedList();
    Node currentNode = head;
    while(currentNode != null){
      reversedLinkedList.insert(currentNode.getValue());
      currentNode = currentNode.getNext();
    }
    return reversedLinkedList;
  }


  public void reverseTwo(){
    Node currentNode = head;
    head = tail;
    tail = currentNode;

    Node previousNode = null;
    Node nextNode;

    while (currentNode != null){
      nextNode = currentNode.getNext();
      currentNode.setNext(previousNode);
      previousNode = currentNode;
      currentNode = nextNode;
    }
  }



  public void insert(int value) {
    Node<T> newHead = new Node(value);

    if (head == null){
      head = newHead;
      tail = newHead;
    }
    else {
      newHead.setNext(head);
      head = newHead;
    }
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

  public void append(T value){
    Node currentNode = head;
    while (currentNode != null){
      //System.out.println(currentNode);
      if (currentNode.getNext() == null){
        //System.out.println("i am here");
        Node newNextNode = new Node((Integer) value);
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
    Node<T> currentNode = head;
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

  public int kthFromEnd(int k) throws Exception{
      if (k>=size) throw new Exception("K is too large for this list");
      Node currentNode = head;
      for (int i = 0; i < size; i++) {
        if (i == (size - abs(k) - 1)) {
          return currentNode.getValue();
        } else {
          currentNode = currentNode.getNext();
        }
      }
    return 0;
  }

  public LinkedList zip(LinkedList list1, LinkedList list2){
    LinkedList newLinkedList = new LinkedList();
    list1 = list1.reverse();
    list2 = list2.reverse();

    Node listOneNode = list1.head;
    Node listTwoNode = list2.head;

    while (listOneNode != null  || listTwoNode != null){
      if (listOneNode == null) {
        newLinkedList.insert(listTwoNode.getValue());
        listTwoNode = listTwoNode.getNext();
      } else if (listTwoNode == null){
        newLinkedList.insert(listOneNode.getValue());
        listOneNode = listOneNode.getNext();
      } else {
        newLinkedList.insert(listOneNode.getValue());
        newLinkedList.insert(listTwoNode.getValue());
        listOneNode = listOneNode.getNext();

        listTwoNode = listTwoNode.getNext();
      }
    }
    return newLinkedList;
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