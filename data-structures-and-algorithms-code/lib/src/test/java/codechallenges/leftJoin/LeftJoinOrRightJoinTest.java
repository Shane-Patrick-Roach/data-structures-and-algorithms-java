package codechallenges.leftJoin;

import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import static codechallenges.leftJoin.LeftJoin.leftJoin;
import static codechallenges.leftJoin.LeftJoin.leftJoinOrRightJoin;

public class LeftJoinOrRightJoinTest {

    @Test
    void leftOrRightJoinTest(){
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

        System.out.println(leftJoinOrRightJoin(hashMapOne,hashMapTwo,true));
    }
}
