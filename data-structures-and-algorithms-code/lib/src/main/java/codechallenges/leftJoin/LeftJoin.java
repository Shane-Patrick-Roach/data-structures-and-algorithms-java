package codechallenges.leftJoin;

import datastructures.hashmap.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {


    public static List<List<String>> leftJoin(HashMap<String,String> hashMapOne, HashMap<String,String> hashMapTwo){
        List<List<String>> results = new ArrayList<>();
        List<String> keysList = hashMapOne.keys();   //o(n)

        for (String key : keysList) {
            List<String> comp = new ArrayList<>();
            comp.add(key);
            comp.add(hashMapOne.get(key));
            if (hashMapTwo.get(key) != null){
                comp.add(hashMapTwo.get(key));
            } else {
                comp.add(null);
            }
            results.add(comp);
        }
        return results;
    }


//    public static List<List<String>> leftJoinOrRightJoin(HashMap<String,String> hashMapOne, HashMap<String,String> hashMapTwo, boolean rightJoin){
//        List<List<String>> results = new ArrayList<>();
//        List<String> keysList = null;
//
//        if (rightJoin){
//            keysList = hashMapTwo.keys();
//        } else {
//            keysList = hashMapOne.keys();
//        }
//
//        for (String key : keysList) {
//            List<String> comp = new ArrayList<>();
//            comp.add(key);
//            comp.add(hashMapOne.get(key));
//            if (hashMapTwo.get(key) != null){
//                comp.add(hashMapTwo.get(key));
//            } else {
//                comp.add(null);
//            }
//            results.add(comp);
//        }
//        return results;
//    }

}
