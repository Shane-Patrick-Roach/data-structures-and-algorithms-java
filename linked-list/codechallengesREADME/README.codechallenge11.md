# Challenge Summary
Implement a psuedo-queue using two stacks.

## Whiteboard Process
Code Challenge 11: ![Code Challenge 11 Diagram](../lib/images/Java_CodeChallenge11.jpg)


## Approach & Efficiency
The big(O) runtime efficiency would be O(1) because it is a queue. 
The big(O) space efficiency would also be O(1) because there is no more space being allocated within the algoritihm.

## Solution
The queue is stored within Stack 2. Every time an element is enqueued. The elementes in stack 2 are poured into stack 1,
then the new element is added on top. Then each of the elementes is poured back into stack 2 with the first element inserted in the PseudoQueue
to be the first one out when dequeued method is called. 

- Test `testPsuedoQueueEnqueue` tests the ability to enqueue an element.
- Test `testPsuedoQueueMultipleEnqueue` tests the ability to make multiple enqueues.
- Test `testPsuedoQueueEnqueueFIFO` tests to ensure the first element in is the first one out.
- Test `testPsuedoQueueDequeue` tests method to dequeue an element.
- Test `testPsuedoQueueMultipleDequeue` tests multiple dequeues.
- Test `testPsuedoQueueDequeueEmptyStack` tests an error is thrown when you dequeue an empty stack.
