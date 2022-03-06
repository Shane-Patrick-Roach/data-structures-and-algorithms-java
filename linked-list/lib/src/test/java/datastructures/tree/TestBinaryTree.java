package datastructures.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBinaryTree {

    Node ten = new Node();
    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();


    @Test
    void testBinaryTreePreOrder(){
        BinaryTree sut = new BinaryTree();

        ten.setLeftNode(six);
        ten.setRightNode(fifteen);
        ten.setValue(10);

        six.setLeftNode(three);
        six.setRightNode(null);
        six.setValue(6);

        three.setLeftNode(null);
        three.setRightNode(null);
        three.setValue(3);

        fifteen.setLeftNode(null);
        fifteen.setRightNode(null);
        fifteen.setValue(15);

        sut.root = ten;
        assert (sut.preOrderTraversal().toString().equals("[10, 6, 3, 15]"));
    }


    @Test
    void testBinaryTreeInOrder(){
        BinaryTree sut = new BinaryTree();

        ten.setLeftNode(six);
        ten.setRightNode(fifteen);
        ten.setValue(10);

        six.setLeftNode(three);
        six.setRightNode(null);
        six.setValue(6);

        three.setLeftNode(null);
        three.setRightNode(null);
        three.setValue(3);

        fifteen.setLeftNode(null);
        fifteen.setRightNode(null);
        fifteen.setValue(15);

        sut.root = ten;
        sut.preOrderTraversal();
        assert (sut.inOrderTraversal().toString().equals("[3, 6, 10, 15]"));
    }


    @Test
    void testBinaryTreePostOrder(){
        BinaryTree sut = new BinaryTree();

        ten.setLeftNode(six);
        ten.setRightNode(fifteen);
        ten.setValue(10);

        six.setLeftNode(three);
        six.setRightNode(null);
        six.setValue(6);

        three.setLeftNode(null);
        three.setRightNode(null);
        three.setValue(3);

        fifteen.setLeftNode(null);
        fifteen.setRightNode(null);
        fifteen.setValue(15);

        sut.root = ten;
        sut.preOrderTraversal();
        assert (sut.postOrderTraversal().toString().equals("[3, 6, 15, 10]"));
    }



}
