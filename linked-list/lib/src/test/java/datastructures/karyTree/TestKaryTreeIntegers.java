package datastructures.karyTree;

import datastructures.kTree.Node;
import datastructures.kTree.KaryTree;

import org.junit.jupiter.api.Test;

public class TestKaryTreeIntegers {



    @Test
    void testKaryTreePreOrderIntegers(){
        KaryTree<Integer> sut = new KaryTree<>(3,null);

        Node<Integer> five = new Node<>(5,sut.getK());
        Node<Integer> three = new Node<>(3,sut.getK());
        Node<Integer> four = new Node<>(4,sut.getK());
        Node<Integer> six = new Node<>(6,sut.getK());
        Node<Integer> two = new Node<>(2,sut.getK());



//            5
//         /  |  \
//       3    4   6
//     / |
//    2  1


        sut.setRoot(five);
        sut.getRoot().addChild(three);
        sut.getRoot().addChild(four);
        sut.getRoot().addChild(six);
        three.addChild(two);


        System.out.println(sut.getRoot().getChildren().size());
        System.out.println(sut.preOrderTraversal());
    }


    @Test
    void testKaryTreePreOrderStrings(){
        KaryTree<String> sut = new KaryTree<>(3,null);

        Node<String> five = new Node<>("Hello",sut.getK());
        Node<String> three = new Node<>("There",sut.getK());
        Node<String> four = new Node<>("Are",sut.getK());
        Node<String> six = new Node<>("You",sut.getK());
        Node<String> two = new Node<>("OK",sut.getK());

//               Hello
//          /      |     \
//       There    Are     You
//     /
//    OK

        sut.setRoot(five);
        sut.getRoot().addChild(three);
        sut.getRoot().addChild(four);
        sut.getRoot().addChild(six);
        three.addChild(two);

        System.out.println(sut.getRoot().getChildren().size());
        System.out.println(sut.preOrderTraversal());
    }

}
