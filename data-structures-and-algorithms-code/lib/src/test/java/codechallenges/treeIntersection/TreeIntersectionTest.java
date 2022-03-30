package codechallenges.treeIntersection;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import static codechallenges.treeIntersection.TreeIntersection.treeIntersection;

public class TreeIntersectionTest {

    Node ten = new Node();
    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();
    Node sixTreeTwo = new Node();
    Node tenTreeTwo = new Node();
    Node threeTreeTwo = new Node();
    Node four = new Node();
    Node five = new Node();
    Node one = new Node();

    @Test
    void testTreeIntersection(){
        BinaryTree sut = new BinaryTree();
        BinaryTree sut2 = new BinaryTree();

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


        tenTreeTwo.setLeftNode(four);
        tenTreeTwo.setRightNode(five);
        tenTreeTwo.setValue(10);

        four.setLeftNode(threeTreeTwo);
        four.setValue(4);

        threeTreeTwo.setValue(3);

        five.setRightNode(sixTreeTwo);
        five.setValue(5);

        sixTreeTwo.setValue(6);

        sut2.root = tenTreeTwo;

        assert (treeIntersection(sut,sut2).toString().equals("[10, 3, 6]"));
    }


    @Test
    void testTreeIntersectionSameTree(){
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

        assert (treeIntersection(sut,sut).toString().equals("[10, 6, 3, 15]"));
    }


    @Test
    void testTreeIntersectionNoMatches(){
        BinaryTree sut = new BinaryTree();
        BinaryTree sut2 = new BinaryTree();

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

        one.setValue(1);
        sut2.root = one;

        assert (treeIntersection(sut,sut2).toString().equals("[]"));
    }
}
