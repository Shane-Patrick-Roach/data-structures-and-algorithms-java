package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBinaryTreeMaxValue {

    Node ten = new Node();
    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();

    @Test
    void testBinaryTreeFindMaximumValueUsingBreadth() throws Exception {
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

        sut.findMaxValue();
        assert (sut.maximumValue == 15);
    }


    @Test
    void testBinaryTreeFindMaximumValEmptyTree() throws Exception {
        BinaryTree sut = new BinaryTree();
        assertThrows(Exception.class, sut::findMaxValue);
    }
}
