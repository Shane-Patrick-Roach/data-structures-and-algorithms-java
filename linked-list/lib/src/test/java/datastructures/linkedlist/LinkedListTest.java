package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    void testSize(){
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        System.out.println(sut.size());
    }


    @Test
    void testKthFromEndGreaterThanLength() throws Exception{
        LinkedList sut = new LinkedList();
        sut.insert(5);
        sut.insert(10);
        sut.insert(3);
        sut.size();
        assertThrows(Exception.class, () -> sut.kthFromEnd(10));
    }

    @Test
    void testKthFromEndSameLength(){
        LinkedList sut = new LinkedList();
        sut.insert(1);
        sut.insert(3);
        sut.insert(8);
        sut.insert(2);
        sut.size();
        assertThrows(Exception.class, () -> sut.kthFromEnd(4));
    }

    @Test
    void testKthFromEndPositiveInt() throws Exception{
        LinkedList sut = new LinkedList();
        sut.insert(1);
        sut.insert(3);
        sut.insert(8);
        sut.insert(2);
        sut.size();
        assert(sut.kthFromEnd(2) == 8);
    }

    @Test
    void testKthFromEndSizeOne() throws Exception{
        LinkedList sut = new LinkedList();
        sut.insert(1);
        sut.size();
        assert(sut.kthFromEnd(0) == 1);
    }

    @Test
    void testKthFromEndMiddleOfList() throws Exception{
        LinkedList sut = new LinkedList();
        sut.insert(1);
        sut.insert(1);
        sut.insert(3);
        sut.insert(8);
        sut.insert(2);
        sut.size();
        assert(sut.kthFromEnd(2) == 3);
    }

    @Test
    void testZipper(){
        LinkedList list1 = new LinkedList();
        list1.insert(2);
        list1.insert(3);
        list1.insert(1);
        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(9);
        list2.insert(5);
        LinkedList list3 = new LinkedList();
        list3 = list3.zip(list2,list1);
        System.out.println(list3);
        assert(list3.toString().equals("{1} -> {5} -> {3} -> {9} -> {2} -> {4} -> NULL"));
    }

    @Test
    void testZipperWithDifferentSizes(){
        LinkedList list1 = new LinkedList();
        list1.insert(2);
        list1.insert(1);
        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(9);
        list2.insert(5);
        list2.insert(13);
        LinkedList list3 = new LinkedList();
        list3 = list3.zip(list2,list1);
        System.out.println(list3);
        assert(list3.toString().equals("{13} -> {5} -> {1} -> {9} -> {2} -> {4} -> NULL"));
    }

    @Test
    void testZipperWithNullValue(){
        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(9);
        list2.insert(5);
        list2.insert(13);
        LinkedList list3 = new LinkedList();
        assertThrows(Exception.class, () -> list3.zip(list2,null));
    }

    @Test
    void testReverse(){
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        System.out.println(list1);
        System.out.println(list1.reverse());
    }

}


