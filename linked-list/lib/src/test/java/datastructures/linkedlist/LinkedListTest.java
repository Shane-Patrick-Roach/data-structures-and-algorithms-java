package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{

    @Test
    void testEmpty(){
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assert(sut.head == null);
    }

    @Test
    void testInsert(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        assert(sut.head.getValue() == 5);
    }

    @Test
    void testHeadPointer() {
      LinkedList sut = new LinkedList();
      sut.insert(5);
      sut.insert(10);
      Node getNextHead = sut.head.getNext();
      assert(getNextHead.getValue() == 5);
    }

    @Test
    void testMultipleInserts() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insert(5);
        assert(sut.includes(10));
    }


    @Test
    void testIncludesTrue() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(sut.includes(3));
    }

    @Test
    void testIncludesFalse() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(!sut.includes(14));
    }

    @Test
    void testReturnCollection() {
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        assert(sut.toString().equals("{3} -> {10} -> {5} -> NULL"));
    }

    @Test
    void testAppend(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.append(6);
        assert(sut.toString().equals("{3} -> {10} -> {5} -> {6} -> NULL"));
    }

    @Test
    void testMultipleAppend(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.append(6);
        sut.append(7);
        assert(sut.toString().equals("{3} -> {10} -> {5} -> {6} -> {7} -> NULL"));
    }


    @Test
    void testInsertBefore(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insertBefore(10,2);
        assert(sut.toString().equals("{3} -> {2} -> {10} -> {5} -> NULL"));
    }

    @Test
    void testInsertBeforeFirstNode(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insertBefore(3,2);
        assert(sut.toString().equals("{2} -> {3} -> {10} -> {5} -> NULL"));
        System.out.println(sut);
    }

    @Test
    void testInsertAfterMiddle(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insertAfter(10, 30);
        assert(sut.toString().equals("{3} -> {10} -> {30} -> {5} -> NULL"));
    }

    @Test
    void testInsertAfterLast(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.insertAfter(5, 30);
        assert(sut.toString().equals("{3} -> {10} -> {5} -> {30} -> NULL"));
    }





}


