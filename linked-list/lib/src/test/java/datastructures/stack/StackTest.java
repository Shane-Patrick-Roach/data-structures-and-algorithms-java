package datastructures.stack;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    void testPush(){
        Stack <Integer> sut = new Stack<>();
        sut.push(5);
        assert(!sut.isEmpty());
    }


    @Test
    void testPushMultipleValues() throws Exception {
        Stack <Integer> sut = new Stack<>();
        sut.push(3);
        sut.push(2);
        sut.push(1);
        assert(sut.peek() == 1);
    }

    @Test
    void testPop() throws Exception {
        Stack <Integer> sut = new Stack<>();
        sut.push(3);
        sut.pop();
        assert(sut.isEmpty());
    }


    @Test
    void testEmptyAfterMultiplePops() throws Exception {
        Stack <Integer> sut = new Stack<>();
        sut.push(3);
        sut.push(3);
        sut.push(3);
        sut.pop();
        sut.pop();
        sut.pop();
        assert(sut.isEmpty());
    }


    @Test
    void testPeekNextItem() throws Exception {
        Stack <Integer> sut = new Stack<>();
        sut.push(3);
        System.out.println(sut.peek());
        assert(sut.peek() == 3);
    }

    @Test
    void testEmptyStack() throws Exception {
        Stack <Integer> sut = new Stack<>();
        assert(sut.isEmpty());
    }

    @Test
    void testPopOnEmptyThrowsException() throws Exception {
        Stack <Integer> sut = new Stack<>();
        assertThrows(Exception.class, sut::pop);
    }

    @Test
    void testPeekOnEmptyThrowsException() throws Exception {
        Stack <Integer> sut = new Stack<>();
        assertThrows(Exception.class, sut::peek);
    }

}
