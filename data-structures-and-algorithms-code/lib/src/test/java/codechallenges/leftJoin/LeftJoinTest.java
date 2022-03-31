package codechallenges.leftJoin;

import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import static codechallenges.leftJoin.LeftJoin.leftJoin;

public class LeftJoinTest {


    @Test
    void leftJoinTest(){
        HashMap<String,String> hashMapOne = new HashMap<>(10);
        HashMap<String,String> hashMapTwo = new HashMap<>(10);

        hashMapOne.set("diligent", "employed");
        hashMapOne.set("fond", "enamored");
        hashMapOne.set("guide", "usher");
        hashMapOne.set("outfit", "garb");
        hashMapOne.set("wrath", "anger");

        hashMapTwo.set("diligent", "idle");
        hashMapTwo.set("fond", "averse");
        hashMapTwo.set("guide", "follow");
        hashMapTwo.set("outfit", "jam");
        hashMapTwo.set("wrath", "delight");

        assert(leftJoin(hashMapOne,hashMapTwo).toString().equals("[[diligent, employed, idle], [wrath, anger, delight], [fond, enamored, averse], [guide, usher, follow], [outfit, garb, jam]]"));
    }


    @Test
    void leftJoinTestMissingValues(){
        HashMap<String,String> hashMapOne = new HashMap<>(10);
        HashMap<String,String> hashMapTwo = new HashMap<>(10);

        hashMapOne.set("diligent", "employed");
        hashMapOne.set("fond", "enamored");
        hashMapOne.set("guide", "usher");
        hashMapOne.set("outfit", "garb");
        hashMapOne.set("wrath", "anger");

        hashMapTwo.set("diligent", "idle");
        hashMapTwo.set("fond", "averse");
        hashMapTwo.set("guide", "follow");
        hashMapTwo.set("flow", "jam");
        hashMapTwo.set("wrath", "delight");

        assert(leftJoin(hashMapOne,hashMapTwo).toString().equals("[[diligent, employed, idle], [wrath, anger, delight], [fond, enamored, averse], [guide, usher, follow], [outfit, garb, null]]"));
    }


    @Test
    void leftJoinTestEmptySecondHashmap(){
        HashMap<String,String> hashMapOne = new HashMap<>(10);
        HashMap<String,String> hashMapTwo = new HashMap<>(10);

        hashMapOne.set("diligent", "employed");
        hashMapOne.set("fond", "enamored");
        hashMapOne.set("guide", "usher");
        hashMapOne.set("outfit", "garb");
        hashMapOne.set("wrath", "anger");

        assert(leftJoin(hashMapOne,hashMapTwo).toString().equals("[[diligent, employed, null], [wrath, anger, null], [fond, enamored, null], [guide, usher, null], [outfit, garb, null]]"));
    }

    @Test
    void leftJoinTestSameHashmap(){
        HashMap<String,String> hashMapOne = new HashMap<>(10);

        hashMapOne.set("diligent", "employed");
        hashMapOne.set("fond", "enamored");
        hashMapOne.set("guide", "usher");
        hashMapOne.set("outfit", "garb");
        hashMapOne.set("wrath", "anger");

        assert(leftJoin(hashMapOne,hashMapOne).toString().equals("[[diligent, employed, employed], [wrath, anger, anger], [fond, enamored, enamored], [guide, usher, usher], [outfit, garb, garb]]"));
    }


    @Test
    void leftJoinTestEmptyHashmap(){
        HashMap<String,String> hashMapOne = new HashMap<>(10);
        assert(leftJoin(hashMapOne,hashMapOne).toString().equals("[]"));
    }


}
