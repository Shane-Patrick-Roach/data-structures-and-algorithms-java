package codechallenges.treeIntersection;

import datastructures.hashmap.HashMap;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

import java.util.ArrayList;
import java.util.List;



public class TreeIntersection {


    public static List<Integer> treeIntersection(BinaryTree treeOne, BinaryTree treeTwo){
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> listOne = treeOne.preOrderTraversal();
        ArrayList<Integer> listTwo = treeTwo.preOrderTraversal();
        datastructures.hashmap.HashMap<Integer, Integer> hashMap = new HashMap<>(10);

        for (Integer value : listOne){
            hashMap.set(value,1);
        }

        for (Integer value : listTwo){
            if (hashMap.contains(value)) {
                results.add(value);
            }
        }
        return results;
    }
}
