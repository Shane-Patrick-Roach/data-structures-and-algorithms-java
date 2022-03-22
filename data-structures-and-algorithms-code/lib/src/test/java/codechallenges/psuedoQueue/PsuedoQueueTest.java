//package codechallenges.psuedoQueue;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class PsuedoQueueTest {
//
//    @Test
//    void testPsuedoQueueEnqueue() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        sut.enqueue(1);
//        assert(sut.size == 1);
//    }
//
//
//    @Test
//    void testPsuedoQueueMultipleEnqueue() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        sut.enqueue(1);
//        sut.enqueue(1);
//        sut.enqueue(1);
//        assert(sut.size == 3);
//    }
//
//    @Test
//    void testPsuedoQueueEnqueueFIFO() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        //sut.enqueue(1);
//        sut.enqueue(3);
//        sut.enqueue(2);
//        sut.enqueue(1);
//        assert(sut.stack2.peek() == 3);
//    }
//
//    @Test
//    void testPsuedoQueueDequeue() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        //sut.enqueue(1);
//        sut.enqueue(3);
//        sut.enqueue(2);
//        sut.enqueue(1);
//        sut.dequeue();
//        assert(sut.stack2.peek() == 2);
//    }
//
//
//    @Test
//    void testPsuedoQueueMultipleDequeue() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        //sut.enqueue(1);
//        sut.enqueue(3);
//        sut.enqueue(2);
//        sut.enqueue(1);
//        sut.dequeue();
//        sut.dequeue();
//        assert(sut.stack2.peek() == 1);
//    }
//
//    @Test
//    void testPsuedoQueueDequeueEmptyStack() throws Exception {
//        PsuedoQueue<Integer> sut = new PsuedoQueue<>();
//        assertThrows(Exception.class, sut::dequeue);
//    }
//
//}
