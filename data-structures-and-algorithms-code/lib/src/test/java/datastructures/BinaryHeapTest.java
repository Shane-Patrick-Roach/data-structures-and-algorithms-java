package datastructures;

import datastructures.heap.BinaryHeap;
import org.junit.jupiter.api.Test;

public class BinaryHeapTest {

    @Test
    void BinaryHeapConstruction(){
        BinaryHeap sut = new BinaryHeap();
        System.out.println(sut);
    }


    @Test
    void BinaryHeapInsert(){
        BinaryHeap sut = new BinaryHeap();
        sut.insert(10);
        sut.insert(1);
        sut.insert(30);
        sut.insert(-31);
        sut.insert(0);
    }

}
