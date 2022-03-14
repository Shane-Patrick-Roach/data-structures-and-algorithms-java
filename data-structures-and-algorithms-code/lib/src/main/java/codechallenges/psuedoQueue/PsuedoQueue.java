package codechallenges.psuedoQueue;

import datastructures.stack.Node;
import datastructures.stack.Stack;

public class PsuedoQueue <T> {
    Stack <T> stack1 = new Stack<>();
    Stack <T> stack2 = new Stack<>();
    int size = stack2.size;



    public void enqueue(T value) throws Exception {



        if (stack2.top == null){
            stack1.push(value);
            stack2.push(stack1.peek());
            stack1.pop();

        } else {
            while (stack2.top != null) {
                stack1.push(stack2.peek());
                //System.out.println(stack2.peek());
                stack2.pop();
                //System.out.println(stack1.peek());
            }

            stack1.push(value);

            while (stack1.top != null) {
                stack2.push(stack1.peek());
                //System.out.println(stack2.peek());
                stack1.pop();
            }
        }
        //System.out.println(stack1.size);
        size = stack2.size;
    }


    public void dequeue() throws Exception {
        if (stack2 != null) {
            stack2.pop();
            size = stack2.size;
        }

    }

}
