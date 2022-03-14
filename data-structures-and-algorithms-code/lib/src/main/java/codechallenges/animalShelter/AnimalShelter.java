package codechallenges.animalShelter;

import datastructures.stack.Stack;

import java.awt.event.WindowStateListener;

public class AnimalShelter{
    Stack<Animal> stack1 = new Stack<>();
    Stack <Animal> stack2 = new Stack<>();
    int size = stack2.size;


    public void enqueue(Animal animal) throws Exception {
        if (stack2.top == null){
            stack2.push(animal);
        } else {
            while (stack2.top != null) {
                stack1.push(stack2.peek());
                stack2.pop();
            }
            stack1.push(animal);
            while (stack1.top != null) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        size = stack2.size;
    }

    public Animal dequeue(String pref) throws Exception {
        Animal chosen = null;
        if(pref.equals("dog")) {
            while (stack2.top!=null){
                if (stack2.peek().type.equals("dog")){
                    chosen = stack2.peek();
                    stack2.pop();
                    break;
                }
                else {
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
            }
            while(stack1.top!=null){
                stack2.push(stack1.peek());
                stack1.pop();
            }
        } else if (pref.equals("cat")) {
            while (stack2.top!=null){
                if (stack2.top.value.type.equals("cat")){
                    chosen = stack2.peek();
                    stack2.pop();
                    break;
                }
                else {
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
            }
            while(stack1.top!=null){
                stack2.push(stack1.peek());
                stack1.pop();
            }

        } else {
            return null;
        }
        size = stack2.size;
        //System.out.println(chosen);
    return chosen;

    }


}
