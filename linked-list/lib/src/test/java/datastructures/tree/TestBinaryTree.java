package datastructures.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBinaryTree {

    @Test
    void testBinaryTreePreOrder(){
        BinaryTree sut = new BinaryTree();


        Node ten = new Node();
        Node six = new Node();
        Node three = new Node();
        Node fifteen = new Node();

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
        System.out.println(sut.preOrderTraversal());

    }


}
