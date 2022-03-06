package datastructures.tree;

import org.junit.jupiter.api.Test;

public class TestBinarySearchTree {

    Node ten = new Node();
    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();

    @Test
    void testInsertBstRoot(){
        BinarySearchTree sut = new BinarySearchTree();
        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        sut.add(ten);
        assert(sut.root.value == 10);
    }



    @Test
    void testInsertBst(){
        BinarySearchTree sut = new BinarySearchTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        six.setValue(6);
        three.setValue(3);
        fifteen.setValue(15);

        sut.add(ten);
        sut.add(six);
        sut.add(three);
        sut.add(fifteen);

        assert(sut.inOrderTraversal().size() == 4);
    }

    @Test
    void testSetRightChildBst(){
        BinarySearchTree sut = new BinarySearchTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        six.setValue(6);

        sut.add(ten);
        sut.add(six);

        assert(ten.getLeftNode().value == 6);
    }

    @Test
    void testSetLeftChildBst(){
        BinarySearchTree sut = new BinarySearchTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        fifteen.setValue(15);
        six.setValue(6);

        sut.add(ten);
        sut.add(six);
        sut.add(fifteen);

        assert(ten.getRightNode().value == 15);
    }


    @Test
    void testContainsBst(){
        BinarySearchTree sut = new BinarySearchTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        six.setValue(6);

        sut.add(ten);
        sut.add(six);

        assert(sut.contains(6));
    }


    @Test
    void testNegativeContainsBst(){
        BinarySearchTree sut = new BinarySearchTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        six.setValue(6);

        sut.add(ten);
        sut.add(six);

        assert(!sut.contains(15));
    }
}
