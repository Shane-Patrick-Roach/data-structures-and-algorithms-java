//package datastructures.karyTree;
//
//import datastructures.kTree.KaryTree;
//import datastructures.kTree.NodeStr;
//import org.junit.jupiter.api.Test;
//
//public class TestKaryTreeStrings {
//
//    @Test
//    void testKaryTreePreOrder(){
//        KaryTree sut = new KaryTree(3,null);
//
//        NodeStr five = new NodeStr("Fizz",sut.getK());
//        NodeInt three = new NodeInt(3,sut.getK());
//        NodeInt four = new NodeInt(4,sut.getK());
//
//
//
////            5
////         /  |  \
////       3    4   6
////     / |
////    2  1
//
//
//        sut.setRoot(five);
//        sut.getRoot().addChild(three);
//
//        System.out.println(sut.getRoot().getChildren().size());
//        System.out.println(sut.preOrderTraversal());
//    }
//}
