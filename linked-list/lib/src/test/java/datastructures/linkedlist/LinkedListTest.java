package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{

    @Test void testEmpty(){
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assert(sut.head == null);
    }

    @Test void testInsert(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        assert(sut.head.getValue() == 5);
    }

    @Test void testHeadPointer() {
      LinkedList sut = new LinkedList();
      sut.insert(5);
      sut.insert(10);
      Node getNextHead = sut.head.getNext();
      assert(getNextHead.getValue() == 5);
    }

    @Test void testMultipleInserts() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insert(5);
        assert(sut.includes(10));
    }


    @Test void testIncludesTrue() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(sut.includes(3));
    }

    @Test void testIncludesFalse() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(!sut.includes(14));
    }

    @Test void testReturnCollection() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(sut.toString().equals("{3} -> {10} -> {5} -> NULL"));
    }






}


