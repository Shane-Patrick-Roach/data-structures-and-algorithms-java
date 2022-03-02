//package codechallenges.animalShelter;
//
//import datastructures.queue.Queue;
//import datastructures.stack.Stack;
//
//import java.awt.event.WindowStateListener;
//
//public class AnimalShelterApproach2 <Animal> {
//    Queue<Animal> queue1 = new Queue<>();
//    Queue<Animal> queue2 = new Queue<>();
//    int size = queue1.size;
//
//
//    public void enqueue(Animal animal) throws Exception {
//        queue1.enqueue(animal);
//        size = queue1.size;
//    }
//
//    public Object dequeue(String pref) throws Exception {
//        Animal chosen = null;
//
//        if(pref.equals("cat")){
//            while(queue1.front != null){
//                if (queue1.front.value instanceof Cat){
//                    chosen = queue1.front.value;
//                    queue1.dequeue();
//                    break;
//                } else {
//                    queue2.enqueue(queue1.peek());
//                    queue1.dequeue();
//                }
//
//                while(queue2.front!= null){
//                    queue1.enqueue(queue2.peek());
//                    queue2.dequeue();
//                }
//            }
//        } else if (pref.equals("dog")){
//            while(queue1.front != null){
//                if (queue1.front.value instanceof Dog){
//                    chosen = queue1.front.value;
//                    queue1.dequeue();
//                    break;
//                } else {
//                    queue2.enqueue(queue1.peek());
//                    queue1.dequeue();
//                }
//
//                while(queue2.front!= null){
//                    queue1.enqueue(queue2.peek());
//                    queue2.dequeue();
//                }
//            }
//
//        }else {
//            return null;
//        }
//        size = queue1.size;
//        return chosen;
//    }
//
//
//}
