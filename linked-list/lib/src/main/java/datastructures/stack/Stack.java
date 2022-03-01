package datastructures.stack;

public class Stack <T>{

    public Node<T> top;
    public int size;

    public int push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.nextNode = top;
        top = newNode;
        return size++;
    }

    public T pop() throws Exception {
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

    public T peek() throws Exception {
        if (top == null){
            throw new Exception("Stack is Empty");
        }
        return top.value;
    }

    boolean isEmpty(){
        return top == null;
    }
}
