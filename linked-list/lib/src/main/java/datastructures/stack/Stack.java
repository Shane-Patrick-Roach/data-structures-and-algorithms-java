package datastructures.stack;

public class Stack <T>{

    Node<T> top;
    int size;

    int push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.nextNode = top;
        top = newNode;
        return size++;
    }

    T pop() throws Exception {
        if (top == null){
            throw new Exception("Stack is Empty");
        }
        if (top.nextNode == null){
            top = top.nextNode;
            size--;
            return null;
        } else {
            top = top.nextNode;
            size --;
            return top.value;
        }
    }

    T peek() throws Exception {
        if (top == null){
            throw new Exception("Stack is Empty");
        }
        return top.value;
    }

    boolean isEmpty(){
        return top == null;
    }
}
