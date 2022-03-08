package codechallenges.breadthFirstTravere;

import codechallenges.breadthFirstTraverse.BreadthFirstTraverse;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static codechallenges.breadthFirstTraverse.BreadthFirstTraverse.breadthFirstTraverse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BreadthFirstTraverseTest {
    Node ten = new Node();
    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();

    @Test
    void testBinaryTreeBreadthFirstTraverse() throws Exception {
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

        assert (breadthFirstTraverse(sut).toString().equals("[10, 6, 15, 3]"));
    }


    @Test
    void testBinaryTreeBreadthFirstTraverseSingleNode() throws Exception {
        BinaryTree sut = new BinaryTree();

        ten.setLeftNode(null);
        ten.setRightNode(null);
        ten.setValue(10);

        sut.root = ten;

        assert (breadthFirstTraverse(sut).toString().equals("[10]"));
    }



    @Test
    void testBreadthFirstTraverseEmptyTree() throws Exception {
        BinaryTree sut = new BinaryTree();
        assertThrows(Exception.class, (Executable) breadthFirstTraverse(sut));
    }

}
