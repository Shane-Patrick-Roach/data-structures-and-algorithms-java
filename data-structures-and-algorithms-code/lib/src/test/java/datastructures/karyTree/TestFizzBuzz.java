package datastructures.karyTree;

import codechallenges.fizzBuzzTree.KaryTreeFizzBuzz;
import datastructures.kTree.KaryTree;
import datastructures.kTree.Node;
import org.junit.jupiter.api.Test;

import static codechallenges.fizzBuzzTree.KaryTreeFizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFizzBuzz {

    @Test
    void testKaryTreeFizzBuzz() throws Exception {
        KaryTree<Integer> sut = new KaryTree<>(3,null);
        KaryTreeFizzBuzz put = new KaryTreeFizzBuzz();

        Node<Integer> five = new Node<>(5,sut.getK());
        Node<Integer> three = new Node<>(3,sut.getK());
        Node<Integer> four = new Node<>(4,sut.getK());
        Node<Integer> six = new Node<>(6,sut.getK());
        Node<Integer> two = new Node<>(2,sut.getK());
        Node<Integer> one = new Node<>(1,sut.getK());
        Node<Integer> fifteen = new Node<>(15, sut.getK());
        Node<Integer> thirty = new Node<>(30, sut.getK());


//        input tree
//            5
//         /  |  \
//       3    4   6
//     / | \        \
//    2  1  15      30


        sut.setRoot(five);
        sut.getRoot().addChild(three);
        sut.getRoot().addChild(four);
        sut.getRoot().addChild(six);
        three.addChild(two);
        three.addChild(one);
        three.addChild(fifteen);
        six.addChild(thirty);



        //Input Integer Tree
        System.out.println(sut.getRoot().getChildren().size());
        System.out.println(sut.preOrderTraversal());

        //Output String Tree
        KaryTree<String> tree = fizzBuzz(sut);
        System.out.println(tree.preOrderTraversal());

        assert (tree.preOrderTraversal().toString().equals("[Buzz, Fizz, 2, 1, Fizz Buzz, 4, Fizz, Fizz Buzz]"));
    }



    @Test
    void testKaryTreeOneValue() throws Exception {
        KaryTree<Integer> sut = new KaryTree<>(3,null);

        Node<Integer> five = new Node<>(5,sut.getK());

//        input tree
//            5

        // Set the root of input tree
        sut.setRoot(five);

        //Input Integer Tree
        System.out.println(sut.preOrderTraversal());

        //Output String Tree
        KaryTree<String> tree = fizzBuzz(sut);
        System.out.println(tree.preOrderTraversal());

        assert (tree.preOrderTraversal().toString().equals("[Buzz]"));
    }



    @Test
    void testKaryTreeEmptyTree() throws Exception{
        KaryTree<Integer> sut = new KaryTree<>(3,null);
//        input tree == EMPTY
        KaryTree<String>tree = fizzBuzz(sut);
        assert(tree == null);
    }

}
