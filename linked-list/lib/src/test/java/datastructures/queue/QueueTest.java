package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {


    @Test
    void testEnqueue() throws Exception {
        Queue<Integer> sut = new Queue<>();
        sut.enqueue(1);
        assert(sut.peek() == 1);
    }


    @Test
    void testMultipleEnqueues() throws Exception {
        Queue<Integer> sut = new Queue<>();
        sut.enqueue(1);
        sut.enqueue(2);
        sut.enqueue(3);
        assert(sut.peek() == 1);
    }

    @Test
    void testDequeue() throws Exception {
        Queue<Integer> sut = new Queue<>();
        sut.enqueue(1);
        sut.enqueue(2);
        sut.enqueue(3);
        assert(sut.dequeue() == 1);
    }

    @Test
    void testPeek() throws Exception {
        Queue<Integer> sut = new Queue<>();
        sut.enqueue(1);
        sut.enqueue(2);
        assert(sut.peek() == 1);
    }


    @Test
    void testEmptyQueueAfterMultipleQueues() throws Exception {
        Queue<Integer> sut = new Queue<>();
        sut.enqueue(1);
        sut.enqueue(2);
        sut.enqueue(3);
        sut.dequeue();
        sut.dequeue();
        sut.dequeue();
        assert(sut.isEmpty());
    }

    @Test
    void testEmptyQueue(){
        Queue<Integer> sut = new Queue<>();
        assert(sut.isEmpty());
    }

    @Test
    void testDequeueOnEmptyQueueThrowsException() throws Exception {
        Queue<Integer> sut = new Queue<>();
        assertThrows(Exception.class, sut::dequeue);
    }

    @Test
    void testPeekOnEmptyQueueThrowsException() throws Exception {
        Queue<Integer> sut = new Queue<>();
        assertThrows(Exception.class, sut::peek);
    }
}


