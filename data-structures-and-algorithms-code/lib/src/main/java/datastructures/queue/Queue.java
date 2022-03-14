package datastructures.queue;

import datastructures.queue.Node;

public class Queue <T>{
    public Node<T> front;
    public Node<T> back;
    public int size;

    public int enqueue(T value){
        if (front == null || back == null) {
            Node<T> newNode = new Node<>(value);
            front = newNode;
            back = newNode;
        } else {
            Node<T> newNode = new Node<>(value);
            back.nextNode = newNode;
            back = newNode;
        }
        return size++;
    }

    public T dequeue() throws Exception {
        if (front == null || back == null) throw new Exception("Queue is empty!");
        T var = front.value;
        front = front.nextNode;
        size --;
        return var;
    }



    public T peek() throws Exception {
        if (front == null || back == null) throw new Exception("Queue is empty!");
        return front.value;
    }

    boolean isEmpty(){
        if (front == null){
            return true;
        } else {
            return false;
        }
    }



}
